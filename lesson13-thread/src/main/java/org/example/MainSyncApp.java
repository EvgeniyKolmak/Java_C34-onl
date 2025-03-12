package org.example;

public class MainSyncApp {

    public static void main(String[] args) throws InterruptedException {

        Marker marker = new Marker();

        Counter counter1 = new Counter(marker);
        Counter counter2 = new Counter(marker);

        Thread thread1 = new Thread(new CounterThread(counter1));
        Thread thread2 = new Thread(new CounterThread(counter2));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(Counter.getValue());

    }

}
