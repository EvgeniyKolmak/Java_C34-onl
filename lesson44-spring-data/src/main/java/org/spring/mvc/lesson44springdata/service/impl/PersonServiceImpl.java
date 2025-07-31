package org.spring.mvc.lesson44springdata.service.impl;

import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.spring.mvc.lesson44springdata.domain.AddresEntity;
import org.spring.mvc.lesson44springdata.domain.PersonEntity;
import org.spring.mvc.lesson44springdata.dto.PageDto;
import org.spring.mvc.lesson44springdata.dto.PersonDto;
import org.spring.mvc.lesson44springdata.dto.PersonUpdateDto;
import org.spring.mvc.lesson44springdata.dto.SearchDto;
import org.spring.mvc.lesson44springdata.mapper.AddresMapper;
import org.spring.mvc.lesson44springdata.mapper.PersonMapper;
import org.spring.mvc.lesson44springdata.repository.AddresRepository;
import org.spring.mvc.lesson44springdata.repository.PersonRepository;
import org.spring.mvc.lesson44springdata.service.PersonService;
import org.spring.mvc.lesson44springdata.service.TestService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        var all = repo.findAllBy();

        return mapper.fromView(all);
    }

    @Override
    public List<PersonDto> findByLogin(SearchDto dto) {

        var specification = createSpecification(dto);

        var all = repo.findAll(specification);

//        var result = repo.findByLoginAndPasswordAndAgeBetweenOrderByAgeDesc(dto.getLogin(), dto.getPassword(), dto.getFrom(), dto.getTo());

        return mapper.toDto(all);
//        var result = repo.findByLogin(login);

//        var result = repo.findByLoginAndPassword(dto.getLogin(), dto.getPassword());

//        var result = repo.findByLoginOrPassword(dto.getLogin(), dto.getPassword());

//        var result = repo.findByAgeBetween(dto.getFrom(), dto.getTo());

//        var result = repo.findByLoginContainsOrderByAgeDesc(dto.getLogin());

//        var user = repo.findByLogin(dto.getLogin());
//
//        if (user.isPresent()) {
//            return mapper.toDto(List.of(user.get()));
//        }
//
//        return List.of();
    }

    @Override
    public void update(PersonUpdateDto dto) {

        var count = repo.updatePassword(dto.getLogin(), dto.getPassword());

        System.out.println("Count updated records: " + count);

//        var person = repo.findByLogin(dto.getLogin())
//                .orElseThrow();
//
//        person.setPassword(dto.getPassword());
    }

    @Override
    public List<PersonDto> findPageble(PageDto dto) {

        var sort = Sort.by("login").descending().and(Sort.by("age").ascending());

        var page = PageRequest.of(dto.getPage() == null ? 0 : dto.getPage(), dto.getSize(), sort);

        var result = repo.findAll(page);

        return mapper.toDto(result.getContent());
    }

    private Specification<PersonEntity> createSpecification(SearchDto dto) {
        return (root, query, builder) -> {

            List<Predicate> predicates = new ArrayList<>();

//            var phones = root.join("phones");
//
//            var number = phones.get("number");
//
//            predicates.add(builder.equal(number, 123L));

            if (StringUtils.isNoneBlank(dto.getLogin()) && StringUtils.isNoneBlank(dto.getPassword())) {
                predicates.add(builder.or(builder.equal(root.get("login"), dto.getLogin()), builder.equal(root.get("password"), dto.getPassword())));
//                predicates.add(builder.equal(root.get("login"), dto.getLogin()));
            }

//            if (StringUtils.isNoneBlank(dto.getPassword())) {
//                predicates.add(builder.equal(root.get("password"), dto.getPassword()));
//            }

            if (dto.getFrom() != null) {
                predicates.add(builder.greaterThanOrEqualTo(root.get("age"), dto.getFrom()));
            }

            if (dto.getTo() != null) {
                predicates.add(builder.lessThanOrEqualTo(root.get("age"), dto.getTo()));
            }

            return builder.and(predicates.toArray(new Predicate[]{}));
        };
    }

}

// %asdsad%
