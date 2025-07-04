package org.example;

import org.example.config.AppConfiguration;
import org.example.config.AspectBenchmarkConfiguration;
import org.example.config.DataConfiguration;
import org.example.domain.UserDto;
import org.example.entity.UserEntity;
import org.example.service.DataService;
import org.example.service.UserHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserDto userDto = new UserDto("vasya2", "qwerty2", 30);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class, DataConfiguration.class, AspectBenchmarkConfiguration.class);
        context.registerShutdownHook();

//        var handler = context.getBean(UserHandler.class);
//
//        handler.register(userDto);

        var bean = context.getBean(DataService.class);
        var byId = bean.findById(2L);

        System.out.println(byId);

    }
}