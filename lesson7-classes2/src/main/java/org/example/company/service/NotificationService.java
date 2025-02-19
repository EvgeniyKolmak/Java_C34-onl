package org.example.company.service;

import org.example.company.domain.User;

public interface NotificationService {

    void sendNotification(User user, String message);

}
