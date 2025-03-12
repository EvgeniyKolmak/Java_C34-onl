package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.currentThread();

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getThreadGroup());

//        Thread thread0 = new MyThread();
//        Thread thread1 = new MyThread();
//        thread0.start();
//        thread1.start();
//
//        thread0.join();
//        thread1.join();

        MyRunnableImpl myRunnable = new MyRunnableImpl();

        Thread thread1 = new Thread(myRunnable, "my_run");
        thread1.start();
        thread1.join();

        System.out.println("1");


        Thread thread2 = new Thread(myRunnable, "my_run");
        thread2.start();
        thread2.join();

        System.out.println("2");

//        System.out.println("start");
//
//        System.out.println(thread1.isAlive());
//        System.out.println("main in progress");
//            thread1.interrupt();

        System.out.println("stop");
    }
}