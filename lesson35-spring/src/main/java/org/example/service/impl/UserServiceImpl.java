package org.example.service.impl;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.User;
import org.example.service.NotificationService;
import org.example.service.TestService;
import org.example.service.UserService;
import org.springframework.beans.factory.BeanNameAware;

import java.util.List;

@Getter
@Setter
public class UserServiceImpl implements UserService, BeanNameAware {

    private final List<NotificationService> notificationServices;

    private TestService tstSrv;

    public UserServiceImpl(List<NotificationService> notificationService) {
        System.out.println("UserServiceImpl constructor");
        this.notificationServices = notificationService;
    }

    @Override
    public void save(User user) {
        tstSrv.test();
        System.out.println("user service save user");
        notificationServices
                .forEach(notificationService -> notificationService.sendNotification("user"));
    }

    public void setTstSrv(TestService tstSrv) {
        System.out.println("UserServiceImpl setTstSrv");
        this.tstSrv = tstSrv;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("UserServiceImpl setBeanName");
    }

    public void runMe() {
        System.out.println("I am happy I am init method");
    }

    public void destroyMe() {
        System.out.println("I am happy I am going to sleep");
    }
}
