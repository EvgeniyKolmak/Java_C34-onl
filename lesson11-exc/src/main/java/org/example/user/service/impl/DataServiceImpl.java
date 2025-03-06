package org.example.user.service.impl;

import org.example.user.domain.User;
import org.example.user.exception.ChildTestMyCheckedException;
import org.example.user.exception.TestMyChekedException;
import org.example.user.exception.UserValidationException;
import org.example.user.service.DataService;

import java.util.Scanner;

public class DataServiceImpl implements DataService {
    @Override
    public void save(User user) throws ChildTestMyCheckedException {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println("user with name " + user.getLogin() + " saved");
    }
}
