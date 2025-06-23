package org.example.service.impl;

import org.example.service.NotificationService;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("validationServiceImpl")
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendMessage(String username) {
        System.out.printf("Wellcome to our company. User %s\n", username);
    }

    @Override
    public void sendError(String username) {
        System.out.printf("Please check your personal data. User %s\n", username);
    }
}
