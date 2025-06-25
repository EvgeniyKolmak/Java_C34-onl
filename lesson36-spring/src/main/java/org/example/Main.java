package org.example;

import org.example.domain.UserDto;
import org.example.service.UserHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserDto userDto = new UserDto("vasya", "qwerty", 20);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        context.registerShutdownHook();

        var handler = context.getBean(UserHandler.class);

        handler.register(userDto);
    }
}