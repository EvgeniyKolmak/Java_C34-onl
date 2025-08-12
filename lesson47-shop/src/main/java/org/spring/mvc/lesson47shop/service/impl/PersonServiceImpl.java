package org.spring.mvc.lesson47shop.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.client.UserClient;
import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.spring.mvc.lesson47shop.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final UserClient client;

    @Override
    public PersonDto create(PersonDto personDto) {
        return client.save(personDto);
    }

    @Override
    public PersonDto findByLogin(String login) {
        return client.find(null, login);
    }
}
