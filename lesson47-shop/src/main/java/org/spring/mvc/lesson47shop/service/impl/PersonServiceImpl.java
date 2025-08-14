package org.spring.mvc.lesson47shop.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.mvc.lesson47shop.client.UserClient;
import org.spring.mvc.lesson47shop.dto.PersonCreateDto;
import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.spring.mvc.lesson47shop.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

//    Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

    private final UserClient client;

    @Override
    public PersonDto create(PersonCreateDto personDto) {

        log.info("Try to create person with name {} and token {} ", personDto.getLogin(), personDto.getToken());
        log.debug("DEbug");
        return client.save(personDto);
    }

    @Override
    public PersonDto findByLogin(String login) {
        return client.find(null, login);
    }
}
