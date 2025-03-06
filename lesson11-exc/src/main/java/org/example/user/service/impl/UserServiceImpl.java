package org.example.user.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.user.domain.FieldErrorDetails;
import org.example.user.domain.User;
import org.example.user.exception.NotifyConnectionException;
import org.example.user.exception.TestMyChekedException;
import org.example.user.exception.UserValidationException;
import org.example.user.service.DataService;
import org.example.user.service.NotificationService;
import org.example.user.service.UserService;
import org.example.user.service.ValidationService;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final ValidationService validationService;
    private final DataService dataService;
    private final NotificationService notificationService;

    @Override
    public void register(User user) {

        boolean isOk = true;

        try {
            validationService.validate(user);
        } catch (UserValidationException exc) {

            User user1 = exc.getUser();

            System.out.println("User with name " + user1.getLogin() + " has wrong data");

            FieldErrorDetails[] details = exc.getDetails();

            for (FieldErrorDetails detail : details) {

                String field = detail.getField();
                String message = detail.getMessage();

                System.out.println("Field " + field + " wrong: " + message);

            }

            isOk = false;
        }

        if (isOk) {
            try {
                dataService.save(user);
            } catch (TestMyChekedException e) {

            }
        }

        try {
            notificationService.sendNotify(user, isOk);
        } catch (NotifyConnectionException exc) {
            System.out.println("Connection error");
        }

    }
}
