package org.spring.mvc.lesson50securityweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/removed")
public class DenyController {

    @GetMapping
    public String deny() {
        return "removed.html";
    }

}
