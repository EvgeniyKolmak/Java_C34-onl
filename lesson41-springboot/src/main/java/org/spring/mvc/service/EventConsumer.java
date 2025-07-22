package org.spring.mvc.service;

import org.spring.mvc.dto.EventDto;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EventConsumer {

    @EventListener
    @Order(2)
    @Async
    public void readEvent1(EventDto eventDto) {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("HR: " + eventDto);
    }

    @EventListener
    @Order(1)
    @Async
    public void readEvent2(EventDto eventDto) {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Security: " + eventDto);
    }

}
