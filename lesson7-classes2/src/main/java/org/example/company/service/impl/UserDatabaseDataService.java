package org.example.company.service.impl;

import org.example.company.domain.User;
import org.example.company.service.UserDataService;

public class UserDatabaseDataService implements UserDataService {

    @Override
    public void saveUser(User user) {
        System.out.println("Save to database user with name: " + user.getLogin());
    }
}
