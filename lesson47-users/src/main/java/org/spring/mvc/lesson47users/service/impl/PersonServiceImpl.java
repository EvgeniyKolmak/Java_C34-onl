package org.spring.mvc.lesson47users.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47users.domain.PersonEntity;
import org.spring.mvc.lesson47users.dto.PersonDto;
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

        var result = repo.save(entity);

        return mapper.toDto(result);
    }

    @Override
    public PersonDto findById(UUID id) {
        return mapper.toDto(repo.findById(id).get());
    }

    @Override
    public PersonDto findByLogin(String login) {
        return mapper.toDto(repo.findByLogin(login));
    }
}
