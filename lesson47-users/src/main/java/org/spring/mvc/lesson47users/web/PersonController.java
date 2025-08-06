package org.spring.mvc.lesson47users.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47users.dto.PersonDto;
import org.spring.mvc.lesson47users.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService service;

    @PostMapping
    public PersonDto save(@RequestBody PersonDto personDto) {
        return service.save(personDto);
    }

    @GetMapping
    public PersonDto find(@RequestParam(name = "id", required = false) String id, @RequestParam(name = "login", required = false) String login) {
        return id != null ? service.findById(UUID.fromString(id)) :  service.findByLogin(login);
    }

}
