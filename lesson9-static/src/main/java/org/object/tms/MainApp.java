package org.object.tms;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User("alex", "qwerty", 20, "asdsda");
        User clonedUser = user.clone();

        System.out.println(clonedUser);

    }

}
