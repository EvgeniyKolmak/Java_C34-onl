package com.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class MainApp {

    public static void main(String[] args) {

        int v1 = 10;
        int v2 = 5;

        // (обьявление) -> {логика}


        CalcService calcService = new CalcService();
        calcService.printSum(v1, v2, Integer::sum);

        calcService.printMult(v1, v2, (value1, value2) -> value1 * value2);

        calcService.printMax(v1, v2, (value1, value2) -> {
            if (value1 > value2) {
                return value1;
            } else {
                return value2;
            }});

        calcService.printMult(10, 0 , (val1, val2) -> {

            int result = 1;

            for (int i = 1; i < val1; i++) {
                result = result * i;
            }

            return result;
        });

        SqService sqService = value1 -> value1 * value1;
        System.out.println(sqService.sq(10));

        EmptyService emptyService = () -> new Random().nextInt();
        System.out.println(emptyService.getRandom());

        Supplier<Integer> mySupplier = () -> new Random().nextInt();
        System.out.println(mySupplier.get());

        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        str.add("Java");

        StrFilter strFilter = variable -> {
            List<String> result = new ArrayList<>();

            for(String item : variable) {
                if (item.length() > 4) {
                    result.add(item);
                }
            }
            return result;
        };

        List<String> filter = strFilter.filter(str);
        System.out.println(filter);

        final int outCount = 10;

        CountChangerService service = () -> {
//            outCount++;
            System.out.println(outCount);
        };

        service.inc();


    }

}

// Predicate -> принять объект и вернуть булеан
// Consumer -> взять объект и ничего не вернуть
// Supplier -> ничего на вход, объект на выход
// Function -> на вход объект и на выход объект