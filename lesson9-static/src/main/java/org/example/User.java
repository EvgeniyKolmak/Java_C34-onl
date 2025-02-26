package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

    private String name;
    private static int age;

    public User() {
        System.out.println("Constructor");
    }

    public static void setAge(int age) {
        User.age = age;
    }

    public static int getAge() {

        return User.age;
    }

}
