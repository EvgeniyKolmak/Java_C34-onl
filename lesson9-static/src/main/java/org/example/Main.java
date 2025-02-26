package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        OuTClass.InClass inCl = new OuTClass.InClass();

        DataUtil.now();

        A a = new B();
        A.run();
        B.run();


        System.out.println(AppConfig.appName);

        User alex = new User();
        alex.setName("Alex");

        User john = new User();
        john.setName("John");

        User.setAge(30);

        System.out.println(alex.getName());
        System.out.println(john.getName());

        System.out.println(User.getAge());

    }


}