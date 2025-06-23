package org.example.config;

import org.example.service.NotificationService;
import org.example.service.TestService;
import org.example.service.UserService;
import org.example.service.impl.TestServiceImpl;
import org.example.service.impl.UserServiceImpl;
import org.springframework.context.annotation.*;

import java.util.List;

//@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfiguration {

//    @Bean
//    public UserService userService(NotificationService notificationServices) {
//        return new UserServiceImpl();
//    }

    @Bean
    public TestService testService(List<NotificationService> notificationServices) {
        return new TestServiceImpl(notificationServices);
    }

}
