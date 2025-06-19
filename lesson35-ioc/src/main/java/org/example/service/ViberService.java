package org.example.service;

public class ViberService implements NotificationService {

    public void send(String message) {
        System.out.println("Viber: " + message);
    }

}
