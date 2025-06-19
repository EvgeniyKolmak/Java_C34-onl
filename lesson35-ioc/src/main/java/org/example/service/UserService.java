package org.example.service;

import java.util.ServiceLoader;

public class UserService implements UserServiceI {

    public void saveUser(String username) {

        System.out.println("User saved in database");

        ServiceLoader<NotificationService> load = ServiceLoader.load(NotificationService.class);

        load.stream()
                .map(ServiceLoader.Provider::get)
                .forEach(service -> service.send("Wellcome " + username));

    }

}
