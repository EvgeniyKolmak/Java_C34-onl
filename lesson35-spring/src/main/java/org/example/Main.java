package org.example;

import org.example.domain.User;
import org.example.service.TestService;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("shop-service.xml");
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