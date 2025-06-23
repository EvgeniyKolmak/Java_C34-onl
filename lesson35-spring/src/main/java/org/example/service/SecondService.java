package org.example.service;

public interface SecondService {

    default void test() {
        System.out.println("<UNK>");
    }
}
