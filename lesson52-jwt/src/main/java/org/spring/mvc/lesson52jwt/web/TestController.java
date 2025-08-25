package org.spring.mvc.lesson52jwt.web;

import lombok.Getter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String doTest() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();

        var principal = authentication.getPrincipal();

        return "test works fine " + principal;
    }

}
