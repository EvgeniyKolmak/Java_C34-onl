package org.example.interfaces;

public class ViberNotificationService implements NotificationService {

    public boolean sendMessage(String text, String username) {
        System.out.println("Send message to viber :" + text);
        return true;
    }

    public void checkDelivery(String username) {
        System.out.println("Check delivery :" + username);
    }

    public void checkConnection() {
        System.out.println("Check connection with viber");
    }
}
