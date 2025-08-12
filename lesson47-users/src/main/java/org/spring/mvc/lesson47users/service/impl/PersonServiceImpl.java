package org.spring.mvc.lesson47users.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47users.dto.PersonDto;
import org.spring.mvc.lesson47users.exc.UserCommonException;
import org.spring.mvc.lesson47users.mapper.PersonMapper;
import org.spring.mvc.lesson47users.repository.PersonRepository;
import org.spring.mvc.lesson47users.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repo;
    private final PersonMapper mapper;

    @Override
    public PersonDto save(PersonDto dto) {
        var entity = mapper.toEntity(dto);

        if (dto.getLogin().equals("admin")) {
            throw new UserCommonException(808101, "admin is disabled");
        }

        if (repo.existsByLogin(entity.getLogin())) {
            throw new UserCommonException(808102, "user with login " + entity.getLogin() + " already exists");
        }

        var result = repo.save(entity);

        return mapper.toDto(result);
    }

    @Override
    public PersonDto findById(UUID id) {
        return mapper.toDto(repo.findById(id).get());
    }

    @Override
    public PersonDto findByLogin(String login) {

        if (!repo.existsByLogin(login)) {
            throw new UserCommonException(808103, "user with login " + login + " does not exist");
        }

        return mapper.toDto(repo.findByLogin(login));
    }
}
