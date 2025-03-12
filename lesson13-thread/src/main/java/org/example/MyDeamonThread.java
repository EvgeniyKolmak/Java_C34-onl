package org.example;

public class MyDeamonThread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("we alive");
        }


        System.out.println("Thread ends");

    }
}
