package org.example.company.service.impl;

import org.example.company.domain.User;
import org.example.company.service.UserValidationService;

public class UserSimpleValidationImpl implements UserValidationService {

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

        if (user.getAge() <= 0 || user.getAge() > 100) {
            return false;
        }

        return true;
    }

}
