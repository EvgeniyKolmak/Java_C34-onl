package org.example.service;

public class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email send message: " + message);
    }
}
