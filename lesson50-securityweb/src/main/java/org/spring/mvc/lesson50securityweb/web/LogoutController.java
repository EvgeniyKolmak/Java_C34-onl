package org.spring.mvc.lesson50securityweb.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finish")
public class LogoutController {

    @GetMapping
    public String logout1(HttpSession session) {
        return "good.html";
    }

    @PostMapping
    public String logout2(HttpSession session) {
        return "good.html";
    }

}
