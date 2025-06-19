package org.example.service.impl;

import org.example.service.NotificationService;

public class TelegramNotificationImpl implements NotificationService {

    public TelegramNotificationImpl() {
        System.out.println("TelegramNotificationImpl constructor");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Send to Telegram");
    }
}
