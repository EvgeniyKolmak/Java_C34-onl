package org.example.user.service.impl;

import org.example.user.domain.User;
import org.example.user.exception.NotifyConnectionException;
import org.example.user.service.NotificationService;

import java.util.Random;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotify(User user, boolean isOk) {

        Random random = new Random();
        int i = random.nextInt(100);

        if (i % 2 == 0) {
            throw new NotifyConnectionException();
        }

        if (isOk) {
            System.out.println("User get welcome message");
        } else {
            System.out.println("User get some errors");
        }

    }
}
