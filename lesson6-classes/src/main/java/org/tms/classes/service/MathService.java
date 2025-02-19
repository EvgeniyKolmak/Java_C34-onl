package org.tms.classes.service;

import org.tms.classes.model.User;

public class MathService {

    public String name;

    // 0 1 1 2 3 5 8 13

    public int inc(int value) {
        System.out.println(value);
        return 11;
    }

    public User inc(User user) {
        user.setAge(30);
        user = new User();
        return user;
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1

    public int factRecurs(int value) {
        return value <= 1
                ? 1
                : value * factRecurs(value - 1);
    }

    public int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    /*

    5 * 4 * 3 * 2 * 1

     */

    public int sum(int value1, int value2) {
        int result = value1 + value2;
        System.out.println("Sum = " + result);
        return result;
    }

    public void printChet(int[] arr) {
        for (int el : arr) {
            printIfChet(el);
        }
    }

    private void printIfChet(int value) {
        if (value % 2 == 0) {
            System.out.println(value);
        }
    }

}
