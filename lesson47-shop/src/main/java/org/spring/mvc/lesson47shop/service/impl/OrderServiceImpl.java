package org.spring.mvc.lesson47shop.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.client.OrderClient;
import org.spring.mvc.lesson47shop.client.ToolClient;
import org.spring.mvc.lesson47shop.dto.*;
import org.spring.mvc.lesson47shop.exc.NoCountToolException;
import org.spring.mvc.lesson47shop.service.OrderService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ToolClient toolClient;
    private final OrderClient orderClient;

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        toolClient.book(orderDto.getToolId(), new OrderCountDto(orderDto.getCount()));
        return orderClient.save(orderDto);
    }
}
