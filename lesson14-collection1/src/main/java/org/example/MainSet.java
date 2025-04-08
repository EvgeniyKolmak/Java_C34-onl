package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

    public static void main(String[] args) {

        String text;

        User user1 = new User("user1",  "qwerty1");
        User user2 = new User("user22",  "qwerty2");
        User user3 = new User("user333",  "qwerty3");
        User user4 = new User("user4444",  "qwerty4");
        User user5 = new User("user55555",  "qwerty5");
        User user6 = new User("user666666",  "qwerty6");
        User user7 = new User("user666666",  "qwerty7");

        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);
        set.add(user6);
        set.add(user7);

        System.out.println(set);

//        Set<String> treeSet = new TreeSet<>();
//        treeSet.add("abc");
//        treeSet.add("cde");
//        treeSet.add("efg");
//        treeSet.add("xyz");
//        treeSet.add("a");
//        treeSet.add("hello");
//
//        System.out.println(treeSet);

    }

}
