package org.example.service.impl;

import org.example.service.NotificationService;
import org.springframework.stereotype.Service;

//@Service
public class NotificationService2Impl implements NotificationService {
    @Override
    public void sendMessage(String username) {
        System.out.println("send email");
    }

    @Override
    public void sendError(String username) {
        System.out.println("send error email");
    }
}
