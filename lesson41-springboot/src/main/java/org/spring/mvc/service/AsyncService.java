package org.spring.mvc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AsyncService {

    private final AsyncService2 asyncService2;

    @Async
    public void runMe1() {
        System.out.println("Hello from runMe1");

        asyncService2.runMe2();

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finish runMe1");
    }

}
