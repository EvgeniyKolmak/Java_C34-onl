package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Timer {

    private Lock lock;

    public Timer(Lock lock) {
        this.lock = lock;
    }

    public void runMe() {

        lock.lock();
        System.out.println("");
        lock.unlock();

    }

}
