package org.spring.mvc.lesson47shop.client;

import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-client", url = "http://127.0.0.1:8081", path = "/person")
public interface UserClient {

    @PostMapping
    PersonDto save(@RequestBody PersonDto personDto);

    @GetMapping
    PersonDto find(@RequestParam(name = "id", required = false) String id, @RequestParam(name = "login", required = false) String login);

}
