package org.example.interfaces;

public interface NotificationService {

    boolean sendMessage(String text, String username);

    void checkDelivery(String username);

    default void checkConnection() {
        System.out.println("Checking connection...");
        System.out.println(getLastMessage());
    }

    private String getLastMessage() {
        return "last";
    }

}
