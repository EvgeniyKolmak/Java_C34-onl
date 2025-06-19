package org.example.service;

public class TelegramService implements NotificationService {

    public void send(String message) {
        System.out.println("Telegram: " + message);
    }

}
