package org.example.company.service.impl;

import org.example.company.domain.User;
import org.example.company.service.UserValidationService;

public class UserAgeValidationService implements UserValidationService {

    @Override
    public boolean isValid(User user) {
        if (user == null) {
            return false;
        }

        if (user.getLogin() == null) {
            return false;
        }

        if (user.getPassword() == null) {
            return false;
        }

        if (user.getAge()  > 18) {
            return true;
        }

        return false;
    }
}
