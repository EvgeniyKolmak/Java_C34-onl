package org.spring.web.controller;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/avatar")
public class AvatarController {

    @GetMapping
    public String addAvatar(Model model) {
        return "avatar";
    }

    @SneakyThrows
    @PostMapping
    public String saveAvatar(@RequestParam(name = "logo") MultipartFile file) {

        var bytes = file.getBytes();

        var size = file.getSize();

        var originalFilename = file.getOriginalFilename();

        System.out.println("File name: " + originalFilename + " size: " + size);

        return "avatar";
    }

}
