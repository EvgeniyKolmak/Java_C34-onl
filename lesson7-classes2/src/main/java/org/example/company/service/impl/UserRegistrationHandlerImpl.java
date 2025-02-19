package org.example.company.service.impl;

import org.example.company.domain.User;
import org.example.company.service.NotificationService;
import org.example.company.service.UserDataService;
import org.example.company.service.UserRegistrationHandler;
import org.example.company.service.UserValidationService;

public class UserRegistrationHandlerImpl implements UserRegistrationHandler {

    private UserValidationService validationService;
    private UserDataService dataService;
    private NotificationService notificationService;

    public UserRegistrationHandlerImpl(UserValidationService validationService,
                                       UserDataService dataService,
                                       NotificationService notificationService) {
        this.validationService = validationService;
        this.dataService = dataService;
        this.notificationService = notificationService;
    }

    @Override
    public void registerUser(User user) {
        var isValid = validationService.isValid(user);

        if (isValid) {
            dataService.saveUser(user);
        }

        notificationService.sendNotification(user, isValid ? "Welcome to our company": "Error registration");
    }
}
