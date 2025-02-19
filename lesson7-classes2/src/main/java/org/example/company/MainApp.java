package org.example.company;

import org.example.company.domain.User;
import org.example.company.service.MyAbstractClass;
import org.example.company.service.UserDataService;
import org.example.company.service.UserRegistrationHandler;
import org.example.company.service.impl.*;

public class MainApp {

    public static void main(String[] args) {

        UserDataService service = new UserDataService() {
            @Override
            public void saveUser(User user) {
                System.out.println("Save using anonymous class");
            }

            public void test() {

            }

        };

        User user = new User("alex", "abc", 20);
        UserRegistrationHandler handler =
                new UserRegistrationHandlerImpl(
                        new UserAgeValidationService(),
                        service,
                        new TelegramNotifcationService()
                );


        handler.registerUser(user);

    }
}
