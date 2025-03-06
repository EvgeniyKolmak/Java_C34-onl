package org.example.user.service;

import org.example.user.domain.User;

public interface NotificationService {

    void sendNotify(User user, boolean isOk);

}
