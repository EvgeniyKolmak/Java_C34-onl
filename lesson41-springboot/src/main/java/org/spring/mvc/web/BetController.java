package org.spring.mvc.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.config.AppConfig;
import org.spring.mvc.service.NotificationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BetController {

    private final AppConfig config;
    private final List<NotificationService> notificationServiceList;

    @GetMapping
    public String test() {

        System.out.println("Min: " + config.getBet().getMin());
        System.out.println("Max: " + config.getBet().getMax());
        System.out.println("Default username: " + config.getUsername());

        notificationServiceList.forEach(NotificationService::sendWellcome);

        return "index";
    }

}
