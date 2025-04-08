package com.lesson16;

import java.util.function.Predicate;

public class PredicService {

    void test(Predicate predicate1, Predicate predicate2) {
        boolean test = predicate1.test(10);
        boolean test2 = predicate2.test(10);

        System.out.println(test && test2);
    }

}
