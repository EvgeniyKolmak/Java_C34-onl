package org.example.user.service.impl;

import org.example.user.domain.User;
import org.example.user.exception.UserValidationException;
import org.example.user.service.ValidationService;

public class ValidationServiceImpl implements ValidationService {
    @Override
    public void validate(User user) throws UserValidationException {

        UserValidationException exc = null;

        if (user.getPassword() == null || user.getPassword().length() < 6) {
            if (exc == null) {
                exc = new UserValidationException();
            }

            exc.setUser(user);
            exc.addDetail("password", "Length can not be less than 6");
        }

        if (user.getAge() == null || user.getAge() < 18) {
            if (exc == null) {
                exc = new UserValidationException();
            }
            exc.setUser(user);
            exc.addDetail("age", "Must be greater than 18");
        }

        if (exc != null) {
            throw exc;
        }

    }
}
