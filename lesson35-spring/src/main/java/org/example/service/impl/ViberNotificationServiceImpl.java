package org.example.service.impl;

import org.example.service.NotificationService;

public class ViberNotificationServiceImpl implements NotificationService {

    public ViberNotificationServiceImpl() {
        System.out.println("ViberNotificationServiceImpl constructor");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Send to Viber");
    }

    public void destroyMe() {
        System.out.println("destroyMe");
    }
}
