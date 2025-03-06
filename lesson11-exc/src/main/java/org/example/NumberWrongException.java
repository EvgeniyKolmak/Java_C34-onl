package org.example;

public class NumberWrongException extends Exception {

    private int value;

    public NumberWrongException(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
