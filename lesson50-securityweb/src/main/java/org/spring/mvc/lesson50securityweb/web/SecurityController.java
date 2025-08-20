package org.spring.mvc.lesson50securityweb.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson50securityweb.service.SecService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sec")
@RequiredArgsConstructor
public class SecurityController {

    private final SecService secService;

    @GetMapping
    public String test() {
        secService.test();
        return "sec";
    }

}
