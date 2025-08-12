package org.spring.mvc.lesson47shop.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.spring.mvc.lesson47shop.service.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping
    public PersonDto create(@RequestBody PersonDto personDto) {
        return service.create(personDto);
    }

    @GetMapping
    public PersonDto findByLogin(@RequestParam("login") String login) {
        return service.findByLogin(login);
    }

}
