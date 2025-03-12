package org.example;

public class WaitNotify {

    boolean isWait = false;

    public void runMe(A a) {

        synchronized (a) {
            try {
                a.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("");
            a.notify();

        };

    }

    public void runMeForWakeUp(A a) {
        synchronized (a) {
            System.out.println("sad");
            a.notifyAll();
        }
    }

}
