package org.example;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {

        Map<Order, User> users = new TreeMap<>();

        users.put(new Order(1), new User("login1", "password1"));
        users.put(new Order(2), new User("login2", "password2"));

        System.out.println(users);

        Collection<User> values = users.values();

        for (User user : values) {
            System.out.println(user);
        }

//        Set<String> keys = users.keySet();
//
//        for (String key : keys) {
//            User user = users.get(key);
//            System.out.println(key + ":" + user);
//        }

//        System.out.println(keys);

//        Set<Map.Entry<String, User>> entries = users.entrySet();
//
//        for (Map.Entry<String, User> item : entries) {
//            String key = item.getKey();
//            User value = item.getValue();
//
//            System.out.println(key + ":" + value);
//        }

//
//        User alex = users.get("alex");
//        System.out.println(alex);
//
//        var user3 = users.getOrDefault("alex", new User("login3", "password3"));

//        users.put("alex", new User("login4", "password4"));
//
//        users.putIfAbsent("alex", new User("login5", "password5"));

//        User alex1 = users.remove("alex");

//        System.out.println(users);


//        System.out.println(users.containsKey("olga"));
//        System.out.println(users.containsValue(new User("login45", "password2")));

    }

}
