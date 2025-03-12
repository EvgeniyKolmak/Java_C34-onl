package org.example;

public class Counter {

    private static volatile int value = 0;
    private Marker marker;

    public Counter(Marker marker) {
        this.marker = marker;
    }

    public void inc() {
        synchronized (marker) {
            value = value + 1;
        }
    }

    public void descr() {
        synchronized (marker) {
            value = value - 1;
        }
    }

    public static int getValue() {
        return value;
    }
}
