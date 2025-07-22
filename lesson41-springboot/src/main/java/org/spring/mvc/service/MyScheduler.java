package org.spring.mvc.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.config.AppConfig;
import org.spring.mvc.dto.EventDto;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
public class MyScheduler {

    private final AsyncService asyncService;
    private final ApplicationEventPublisher publisher;

    @Scheduled(timeUnit = TimeUnit.SECONDS, fixedDelay = 1000)
    public void notifyUsers1() {
        System.out.println("notifyUsers1");
        publisher.publishEvent(new EventDto("notifyUsers1"));
        System.out.println("notifyUsers1 finish");
    }

//    @Scheduled(timeUnit = TimeUnit.SECONDS, fixedDelay = 50)
//    @Async
//    public void notifyUsers2() {
//        System.out.println("notifyUsers2");
//        try {
//            Thread.sleep(10_000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
