package org.example;

public class RunMeTooImpl implements Runnable{
    private DeadClass deadClass;

    public RunMeTooImpl(DeadClass deadClass) {
        this.deadClass = deadClass;
    }

    @Override
    public void run() {
        deadClass.runMeToo();
    }

}
