package com.lesson16;

public class MainThread {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        });

        thread.start();

        System.out.println("main end");

        PredicService predicService = new PredicService();
        predicService.test(v -> true, v -> false);

    }

}
