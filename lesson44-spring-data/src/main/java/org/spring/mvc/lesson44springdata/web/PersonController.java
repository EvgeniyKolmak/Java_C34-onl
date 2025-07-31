package org.spring.mvc.lesson44springdata.web;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.spring.mvc.lesson44springdata.dto.PageDto;
import org.spring.mvc.lesson44springdata.dto.PersonDto;
import org.spring.mvc.lesson44springdata.dto.PersonUpdateDto;
import org.spring.mvc.lesson44springdata.dto.SearchDto;
import org.spring.mvc.lesson44springdata.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping
    public String person(PersonDto dto, Model model) {

        if (StringUtils.isBlank(dto.getStreet())) {
            dto.setStreet(null);
        }

        if (StringUtils.isBlank(dto.getCity())) {
            dto.setCity(null);
        }

        service.save(dto);

        model.addAttribute("persons", service.findAll());

        return "index.html";
    }

    @PostMapping("/search")
    public String search(SearchDto dto, Model model) {
        var result = service.findByLogin(dto);

        model.addAttribute("persons", result);

        return "index.html";

    }

    @PostMapping("/update")
    public String update(PersonUpdateDto dto, Model model) {
        service.update(dto);

        model.addAttribute("persons", service.findAll());

        return "index.html";

    }

    @PostMapping("/page")
    public String update(PageDto dto, Model model) {
        var result = service.findPageble(dto);

        model.addAttribute("persons", result);

        return "index.html";

    }

}
