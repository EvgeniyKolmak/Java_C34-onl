package org.example;

public class MyRunnableImpl implements Runnable {

    private volatile boolean isRunning = true;

    @Override
    public void run() {

        while (isRunning) {
            System.out.println();
        }

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName());
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
