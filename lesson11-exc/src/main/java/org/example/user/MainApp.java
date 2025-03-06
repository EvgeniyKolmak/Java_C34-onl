package org.example.user;

import org.example.user.domain.User;
import org.example.user.service.UserService;
import org.example.user.service.impl.DataServiceImpl;
import org.example.user.service.impl.NotificationServiceImpl;
import org.example.user.service.impl.UserServiceImpl;
import org.example.user.service.impl.ValidationServiceImpl;

public class MainApp {

    public static void main(String[] args) {

        User user = new User("alex", "ww", 3);

        UserService userService = new UserServiceImpl(new ValidationServiceImpl(), new DataServiceImpl(), new NotificationServiceImpl());
        userService.register(user);

    }

}
