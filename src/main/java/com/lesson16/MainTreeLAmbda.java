package com.lesson16;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;

public class MainTreeLAmbda {

    public static void main(String[] args) {

        User user1 = new User(20);
        User user2 = new User(30);
        User user3 = new User(40);

        Comparator<User> comp = (u1, u2) -> u1.getAge() - u2.getAge();

        TreeSet<User> users = new TreeSet<>(comp);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(users);

        Function<Integer, User> userFunc = User::new;

        System.out.println(userFunc.apply(45));


    }

}
