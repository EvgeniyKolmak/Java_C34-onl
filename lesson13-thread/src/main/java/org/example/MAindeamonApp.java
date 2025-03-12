package org.example;

public class MAindeamonApp {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new MyDeamonThread());
        thread.setDaemon(true);

        thread.start();

        Thread.sleep(5_000);

        System.out.println("main ends");

    }

}
