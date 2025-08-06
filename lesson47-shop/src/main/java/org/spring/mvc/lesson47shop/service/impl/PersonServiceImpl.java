package org.spring.mvc.lesson47shop.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.spring.mvc.lesson47shop.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final RestTemplate restTemplate;

    @Override
    public PersonDto create(PersonDto personDto) {
        return restTemplate.postForObject("http://localhost:8081/person", personDto, PersonDto.class);
    }
}
