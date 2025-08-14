package org.spring.mvc.lesson47shop.service;

import org.spring.mvc.lesson47shop.dto.PersonCreateDto;
import org.spring.mvc.lesson47shop.dto.PersonDto;

public interface PersonService {

    PersonDto create(PersonCreateDto personDto);

    PersonDto findByLogin(String login);
}
