package org.spring.mvc.lesson52jwt.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/write")
public class WriteController {

    @GetMapping
    public String write() {
        return "write works fine";
    }

}
