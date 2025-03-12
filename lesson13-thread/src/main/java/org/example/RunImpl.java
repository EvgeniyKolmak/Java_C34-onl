package org.example;

public class RunImpl implements Runnable {

    private DeadClass deadClass;

    public RunImpl(DeadClass deadClass) {
        this.deadClass = deadClass;
    }

    @Override
    public void run() {
        deadClass.runMe();
    }
}
