package org.example.company.service.impl;

import org.example.company.domain.User;
import org.example.company.service.UserDataService;

public class UserFileDataService implements UserDataService {

    @Override
    public void saveUser(User user) {
        System.out.println("Save to file user with name: " + user.getLogin());
    }
}
