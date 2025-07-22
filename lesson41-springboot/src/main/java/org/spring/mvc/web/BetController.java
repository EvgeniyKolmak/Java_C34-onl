package org.spring.mvc.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BetController {

    @GetMapping
    public String test() {
//        System.out.println("Min: " + config.getBet().getMin());
//        System.out.println("Max: " + config.getBet().getMax());
//        System.out.println("Default username: " + config.getUsername());
//
//        notificationServiceList.forEach(NotificationService::sendWellcome);
        return "index";
    }

}
