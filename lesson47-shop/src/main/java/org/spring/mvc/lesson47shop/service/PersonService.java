package org.spring.mvc.lesson47shop.service;

import org.spring.mvc.lesson47shop.dto.PersonDto;

public interface PersonService {

    PersonDto create(PersonDto personDto);

    PersonDto findByLogin(String login);
}
