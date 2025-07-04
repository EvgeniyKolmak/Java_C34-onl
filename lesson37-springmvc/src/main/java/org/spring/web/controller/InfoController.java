package org.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.spring.web.service.InfoHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class InfoController {

    private final InfoHandler infoHandler;

    @RequestMapping("/info")
    public String infoPage() {
        var phoneInformation = infoHandler.getPhoneInformation();
        return "info";
    }

}

// /pages/info.jsp
