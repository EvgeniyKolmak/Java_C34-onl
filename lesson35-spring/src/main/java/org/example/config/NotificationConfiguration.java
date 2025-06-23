package org.example.config;

import org.example.service.NotificationService;
import org.example.service.impl.TelegramNotificationImpl;
import org.example.service.impl.ViberNotificationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class NotificationConfiguration {

    @Bean
    @Primary
    @Scope("prototype")
    public NotificationService viberNotificationService() {
        return new ViberNotificationServiceImpl();
    }

//    @Bean
//    public NotificationService testNotificationService() {
//        return new TelegramNotificationImpl();
//    }

}
