package org.example;

import org.example.config.AppConfiguration;
import org.example.domain.User;
import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User user = new User();

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("shop-service.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        context.registerShutdownHook();

        UserService bean = context.getBean(UserService.class);

        bean.save(user);

//
//        UserService bean2 = context.getBean(UserService.class);
//        bean2.save(user);

//        var bean3 = context.getBean(TestService.class);
//        bean3.test();


    }
}