package org.example;

import org.example.domain.User;

public class Main {
    public static void main(String[] args) {

        User alex = null;
//        alex.setUsername("Alex");
//        alex.setPassword("123456");
//
        User john = new User("John", null);
//
        User olga = new User("Olga", "123456");

        alex = new User("Alex");

        User userWithoutHobby = new User("Test", "pass", null);

        if (alex == null) {
            System.out.println("Alex is empty");
        }

    }
}