package org.spring.mvc.lesson44springdata.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson44springdata.dto.PersonDto;
import org.spring.mvc.lesson44springdata.service.PersonService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PersonService service;

    @GetMapping
    public String index(Model model) {
        var all = service.findAll();

        model.addAttribute("persons", all);

        return "index.html";
    }

}
