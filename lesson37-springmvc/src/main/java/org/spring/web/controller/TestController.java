package org.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class TestController {

    @RequestMapping("/info")
    public String gettestHome() {
        return "info";
    }

}
