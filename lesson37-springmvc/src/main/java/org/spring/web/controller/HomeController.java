package org.spring.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.spring.web.dto.ProfileDto;
import org.spring.web.dto.RequestData;
import org.spring.web.exc.AgeValidationException;
import org.spring.web.exc.PasswordValidationException;
import org.spring.web.service.HomeHandler;
import org.spring.web.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ReflectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Field;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    private final ProfileService service;

    @GetMapping
    public String home(Model model) {
        var profile = new ProfileDto();
        profile.setAge(18);
        model.addAttribute("userprofile", profile);
        return "login";
    }

    @PostMapping("/profile")
    public String homeProfilePage(@Valid @ModelAttribute(name = "userprofile") ProfileDto profile, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        }

        service.process(profile);
        return "shop";
    }

    @ExceptionHandler(AgeValidationException.class)
    public ModelAndView processAgeError(AgeValidationException ex) {

        ModelAndView model = new ModelAndView("error1");

        model.addObject("age", ex.getProfile().getAge());
        System.out.println(ex.getProfile());
        return model;
    }

    @ExceptionHandler(PasswordValidationException.class)
    public String processPasswordError(PasswordValidationException ex) {
        System.out.println(ex.getPassword());
        return "error2";
    }

}