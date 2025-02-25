package org.tms.modify;

public class MainApp {

    public static void main(String[] args) {

        UserService service = new UserService();
        service.test();
        System.out.println(service.name);


    }

}
