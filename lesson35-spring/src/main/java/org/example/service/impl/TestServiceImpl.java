package org.example.service.impl;

import org.example.service.NotificationService;
import org.example.service.TestService;

import java.util.List;

public class TestServiceImpl implements TestService {



    private List<NotificationService>  notificationServiceList;

    public TestServiceImpl(List<NotificationService> notificationServiceList) {

        System.out.println("TestServiceImpl constructor");
        this.notificationServiceList = notificationServiceList;
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}
