package org.example;

import org.example.config.TestConfiguration;
import org.example.domain.UserDto;
import org.example.service.B;
import org.example.service.DataService;
import org.example.service.UserHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserDto userDto = new UserDto("vasya", "qwerty", 20);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();



        var handler = context.getBean(B.class);

//        handler.register(userDto);
    }
}