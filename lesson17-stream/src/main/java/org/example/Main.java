package org.example;

import org.example.domain.Child;
import org.example.domain.User;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        List<User> users = List.of(
                new User("user1", 30, true, List.of(
                        new Child("user_ch_1", 3)
                )),
                new User("user2", 40, false, List.of(
                        new Child("user_ch_2_1", 10),
                        new Child("user_ch_2_2", 15)
                )),
                new User("user3", 20, true, new ArrayList<>()),
                new User("user4", 50, true, List.of(
                    new Child("user_ch_4", 20)
                )),
                new User("user5", 45, false, List.of(
                        new Child("user_ch_5_1", 20),
                        new Child("user_ch_5_2", 15),
                        new Child("user_ch_5_3", 10)
                ))
        );



//        var set = users.stream()
//                .filter(us -> us.getChildList().stream().anyMatch(ch -> ch.getAge() >= 18))
//                .collect(Collectors.toSet());
//
//        System.out.println(set);
//
//        users.stream().parallel()
//                .peek(System.out::println)
//                .sequential()

//        boolean b = users.stream()
//                .noneMatch(us -> us.getAge() < 25);
//
//        System.out.println(b);

//        String collect = List.of("hello", "world", "java").stream()
//                .limit(2)
//                .map(String::toUpperCase)
//                .collect(Collectors.joining(","));
//
//        System.out.println(collect);

//        Map<String, Boolean> collect = users.stream()
//                .collect(Collectors.toMap(User::getName, User::isMan));
//
//        System.out.println(collect);

//        List<Child> collect = users.stream()
//                .flatMap(user -> user.getChildList().stream())
//                .collect(Collectors.toList());

//        User[] array = users.stream()
//                .toArray(User[]::new);
//
//        System.out.println(Arrays.toString(array));

//        User[] arr = new User[users.size()];
//
//        for (int i = 0; i < users.size(); i++) {
//            arr[i] = users.get(i);
//        }
//
//        System.out.println(Arrays.toString(arr));

//        Optional<User> min = users.stream()
//                .max((u1, u2) -> u1.getChildList().size() - u2.getChildList().size());
//
//        if(min.isPresent()) {
//            System.out.println(min.get());
//        }


//        long count = users.stream()
//                .filter(us -> us.getAge() > 30)
//                .count();
//
//        System.out.println(count);

//        if (optUser.isPresent()) {
//            User user = optUser.get();
//            System.out.println(user.getName());
//        }

//        User userOld = null;
//
//        for (User user : users) {
//
//            if (user.getAge() > 90) {
//                userOld = user;
//                break;
//            }
//
//        }
//
//        if (userOld != null) {
//            System.out.println(userOld.getName());
//        }


// generate
//        Stream<String> stream = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9").stream();
//        String[] arr = {"",""};
//        Stream<String> stream = Arrays.stream(arr);
//        Stream<String> stringStream = Stream.of("1", "2", "3");
//        Stream<String> generate = Stream.generate(() -> "hello");
//        Stream<Integer> iterate = Stream.iterate(1, i -> i + 1);
//        Stream<String> lines = Files.lines(Path.of(URI.create("/Users/sergey/text.txt")));

//        users.stream()
//                .map(User::getAge)
//                        .sum();


//        int sum = users.stream()
//                .mapToInt(User::getAge)
//                .sum();
//        System.out.println(sum);

//        users.stream()
//                .distinct()
//                .sorted((el1, el2) -> el1.getAge() - el2.getAge())
//                .forEach(System.out::println);

//        Stream.iterate(0 ,i -> i + 1)
//                .skip(10)
//                .limit(100)
//                .forEach(System.out::println);

//        Stream.of(1,2,3,4,5)
//                .skip(2)
//                .limit(2)
//                .forEach(System.out::println);

//        users.stream()
//                .flatMap(us -> us.getChildList().stream())
//                .map(Child::getName)
//                .forEach(System.out::println);


//        users.stream()
//                .filter(us -> us.getAge() >= 40)
//                .map(User::getName)
//                .forEach(System.out::println);

//        users.stream()
//                .filter(us -> us.getAge() >= 40)
//                .forEach(us -> System.out.println(us.getName()));



//        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream()
//                .filter(num -> num % 2 == 0)
//                .peek(System.out::println)
//                .filter(num -> num > 5)
//                .map(num -> num + "!")
//                .forEach(System.out::println);


//        Set<String> collect = users.stream()
//                .filter(user -> !user.isMan() && user.getChildList() != null)
//                .flatMap(user -> user.getChildList().stream())
//                .filter(ch -> ch.getAge() > 6 && ch.getAge() <= 16)
//                .map(Child::getName)
//                .collect(Collectors.toSet());
//
//        Set<String> chNames = new HashSet<>();
//
//        for (User user : users) {
//
//            if (!user.isMan()) {
//                var childs = user.getChildList();
//
//                if (childs != null) {
//
//                    for (var child: childs) {
//
//                        if (child.getAge() > 6 && child.getAge() <= 16) {
//                            chNames.add(child.getName());
//                        }
//
//                    }
//
//                }
//            }
//
//        }


    }
}