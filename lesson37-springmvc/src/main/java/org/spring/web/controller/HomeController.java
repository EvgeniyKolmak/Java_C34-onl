package org.spring.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.spring.web.dto.ProfileDto;
import org.spring.web.dto.RequestData;
import org.spring.web.service.HomeHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ReflectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home(Model model) {
        return "login";
    }

    @PostMapping("/profile")
    public String homeProfilePage(@Valid ProfileDto profile, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            bindingResult.getFieldErrors()
                    .forEach(fieldError -> model.addAttribute(fieldError.getField() + "Error", fieldError.getDefaultMessage()));

            var fields = profile.getClass()
                    .getDeclaredFields();

            for (Field f : fields) {
                f.setAccessible(true);
                var field = ReflectionUtils.getField(f, profile);
                model.addAttribute(f.getName(), field);
            }

            return "login";
        }


//        boolean isValid = true;
//
//        if (StringUtils.isBlank(profile.getLogin())) {
//            model.addAttribute("loginError", "must be not empty");
//            isValid = false;
//        }
//
//        if (StringUtils.isBlank(profile.getPassword())) {
//            model.addAttribute("passwordError", "must be not empty");
//            isValid = false;
//        }
//
//        if (profile.getAge() == null) {
//            model.addAttribute("ageError", "must be not empty");
//            isValid = false;
//        }
//
//        if (profile.getAge() != null && profile.getAge() < 18) {
//            model.addAttribute("ageError", "age must be greater than 18");
//            isValid = false;
//        }
//
//        if (!isValid) {
//            return "login";
//        }

        return "shop";
    }

}