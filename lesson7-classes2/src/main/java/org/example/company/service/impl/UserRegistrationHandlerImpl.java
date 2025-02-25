package org.example.company.service.impl;

import lombok.AllArgsConstructor;
import org.example.company.domain.User;
import org.example.company.service.NotificationService;
import org.example.company.service.UserDataService;
import org.example.company.service.UserRegistrationHandler;
import org.example.company.service.UserValidationService;

@AllArgsConstructor
public class UserRegistrationHandlerImpl implements UserRegistrationHandler {

    private final UserValidationService validationService;
    private final UserDataService dataService;
    private final NotificationService notificationService;

    @Override
    public void registerUser(User user) {
        var isValid = validationService.isValid(user);

        if (isValid) {
            dataService.saveUser(user);
        }

        notificationService.sendNotification(user, isValid ? "Welcome to our company": "Error registration");
    }
}
