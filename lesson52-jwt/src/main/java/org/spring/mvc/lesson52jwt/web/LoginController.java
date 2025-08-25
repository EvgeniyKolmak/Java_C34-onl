package org.spring.mvc.lesson52jwt.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson52jwt.dto.LoginDto;
import org.spring.mvc.lesson52jwt.service.LoginService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService service;

    @PostMapping
    public String login(@RequestBody LoginDto dto) {
        return "ok";
//        return service.login(dto);
    }

}
