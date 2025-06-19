package org.example;

import org.example.service.UserService;
import org.example.service.UserServiceI;

import java.util.ServiceLoader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServiceLoader<UserServiceI> userServiceLoader = ServiceLoader
                .load(UserServiceI.class);

        userServiceLoader.findFirst()
                        .ifPresent(service -> service.saveUser("Vasya"));

    }
}