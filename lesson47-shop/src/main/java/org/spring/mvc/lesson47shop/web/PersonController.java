package org.spring.mvc.lesson47shop.web;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.PersonCreateDto;
import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.spring.mvc.lesson47shop.service.PersonService;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping
//    @Override
    public PersonDto create(@RequestBody PersonCreateDto personDto) {
        return service.create(personDto);
    }

    @GetMapping()
    public ResponseEntity<PersonDto> findByLogin(@RequestParam("login") String login) {

        var person = service.findByLogin(login);

        person.add(Link.of("http://127.0.0.1/person/" + person.getId()));

        return ResponseEntity.ok(person);
    }

}
// /v1/person
// /v2/person