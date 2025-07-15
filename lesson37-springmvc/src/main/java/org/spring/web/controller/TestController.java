package org.spring.web.controller;

import org.spring.web.dto.ProfileDto;
import org.spring.web.exc.AgeValidationException;
import org.spring.web.exc.UnexpectedException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class TestController {

    @RequestMapping("/info")
    public String gettestHome(@RequestParam(name = "data", required = false) String data) {

        if (data != null) {
            throw new UnexpectedException();
        }

        if (true) {
            throw new AgeValidationException(new ProfileDto());
        }

        return "info";
    }

    @ExceptionHandler(AgeValidationException.class)
    public String processAgeError() {
        return "error1";
    }

}
