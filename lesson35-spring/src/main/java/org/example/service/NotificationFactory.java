package org.example.service;

import org.example.service.impl.ViberNotificationServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class NotificationFactory {

    public NotificationService getNotificationService() {
        return new ViberNotificationServiceImpl();
    }

}
