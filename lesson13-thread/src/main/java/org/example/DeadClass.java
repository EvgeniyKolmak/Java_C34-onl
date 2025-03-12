package org.example;

import static java.lang.Thread.sleep;

public class DeadClass {

    private A a;
    private B b;

    public DeadClass(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void runMe() {

        synchronized (a) {

            try {
                sleep(5_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (b) {
            }

        }

    }

    public void runMeToo() {

        synchronized (b) {
            try {
                sleep(5_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (a) {

            }

        }

    }

}
