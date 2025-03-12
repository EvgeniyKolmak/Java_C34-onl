package org.example;

public class DeadMAinApp {

public static void main(String[] args) throws InterruptedException {

    A a = new A();
    WaitNotify waitNotify = new WaitNotify();
    waitNotify.runMe(a);

//    A a = new A();
//    B b = new B();
//
//    DeadClass deadClass = new DeadClass(a, b);
//
//    Thread thread1 = new Thread(new RunImpl(deadClass));
//    Thread thread2 = new Thread(new RunMeTooImpl(deadClass));
//
//    thread1.start();
//    thread2.start();
//
//    thread1.join();
//    thread2.join();

}
}
