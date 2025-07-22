package org.spring.mvc.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService2 {

    @Async
    public void runMe2() {
        System.out.println("Hello from runMe2");

        try {
            Thread.sleep(15_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finish runMe2");
    }

}
