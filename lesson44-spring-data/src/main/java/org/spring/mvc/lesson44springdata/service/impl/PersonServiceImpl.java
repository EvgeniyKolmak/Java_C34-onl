package org.spring.mvc.lesson44springdata.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.spring.mvc.lesson44springdata.domain.AddresEntity;
import org.spring.mvc.lesson44springdata.domain.PersonEntity;
import org.spring.mvc.lesson44springdata.dto.PersonDto;
import org.spring.mvc.lesson44springdata.dto.SearchDto;
import org.spring.mvc.lesson44springdata.mapper.AddresMapper;
import org.spring.mvc.lesson44springdata.mapper.PersonMapper;
import org.spring.mvc.lesson44springdata.repository.AddresRepository;
import org.spring.mvc.lesson44springdata.repository.PersonRepository;
import org.spring.mvc.lesson44springdata.service.PersonService;
import org.spring.mvc.lesson44springdata.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repo;
    private final AddresRepository addressRepo;
    private final AddresMapper addressMapper;
    private final PersonMapper mapper;
    private final TestService testService;

    @Override
    @Transactional
    public void save(PersonDto dto) {

        var entity = mapper.toEntity(dto);

        repo.save(entity);

        var addres = addressMapper.toEntity(dto);

        testService.runMe();

        var addEnt = addressRepo.save(addres);

        addEnt.setCity("Unknown");

        System.out.println("Hello");
    }

    @Override
    public List<PersonDto> findAll() {
        var all = repo.findAll();

        return mapper.toDto(all);
    }

    @Override
    public List<PersonDto> findByLogin(SearchDto dto) {
//        var result = repo.findByLogin(login);

//        var result = repo.findByLoginAndPassword(dto.getLogin(), dto.getPassword());

//        var result = repo.findByLoginOrPassword(dto.getLogin(), dto.getPassword());

//        var result = repo.findByAgeBetween(dto.getFrom(), dto.getTo());

//        var result = repo.findByLoginContainsOrderByAgeDesc(dto.getLogin());

        var user = repo.findByLogin(dto.getLogin());

        if (user.isPresent()) {
            return mapper.toDto(List.of(user.get()));
        }

        return List.of();
    }
}

// %asdsad%
