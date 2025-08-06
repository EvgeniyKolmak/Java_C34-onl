package org.spring.mvc.lesson47shop.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.spring.mvc.lesson47shop.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping
    public PersonDto create(@RequestBody PersonDto personDto) {
        return service.create(personDto);
    }

}
