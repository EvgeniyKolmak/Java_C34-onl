package org.spring.mvc.service.impl;

import org.spring.mvc.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendWellcome() {
        System.out.println("BetController sendWellcome");
    }
}
