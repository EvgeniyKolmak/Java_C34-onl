package org.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {

        int v1 = 1;
        int v2 = 2;
        int v3 = 3;
        // int -> Integer

        Set<Integer> collect = IntStream.of(v1, v2, v3)
                .boxed()
                .collect(Collectors.toSet());

//        List<Integer> collect1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1)
//                .boxed()
//                .filter(i -> i < 5)
//                .collect(Collectors.toList());

//        List<Integer> collect1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1)
//                .boxed()
//                .takeWhile(i -> i < 5)
//                .collect(Collectors.toList());

        List<Integer> collect1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1)
                .boxed()
                .dropWhile(i -> i < 5)
                .collect(Collectors.toList());

        System.out.println(collect1);

        Stream.of(1,2,3)
                .onClose(() -> System.out.println("stream is closed"))
                .close();



    }

}
