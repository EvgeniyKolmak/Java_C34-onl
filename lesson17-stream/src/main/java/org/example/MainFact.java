package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainFact {

    public static void main(String[] args) {

        long start = System.nanoTime();

        List.of("abc", "cde")
                .stream()
                .flatMapToInt(str -> str.chars())
                .distinct()
                .boxed()
                .map(operand -> operand + "")
                .forEach(System.out::println);

        int sum = IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .parallel()
                .map(MainFact::fact)
                .sum();

        System.out.println(System.nanoTime() - start);
        // 10047114500
        // 1011745042

    }

    public static int fact(int n) {
        int result = 1;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

}
