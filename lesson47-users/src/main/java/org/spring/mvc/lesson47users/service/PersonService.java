package org.spring.mvc.lesson47users.service;

import org.spring.mvc.lesson47users.domain.PersonEntity;
import org.spring.mvc.lesson47users.dto.PersonDto;

import java.util.UUID;

public interface PersonService {

    PersonDto save(PersonDto dto);

    PersonDto findById(UUID id);

    PersonDto findByLogin(String login);

}
