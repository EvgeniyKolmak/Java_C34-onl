package org.spring.mvc.lesson47shop.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.OrderDto;
import org.spring.mvc.lesson47shop.dto.ToolDto;
import org.spring.mvc.lesson47shop.dto.ToolOrderDto;
import org.spring.mvc.lesson47shop.dto.ToolOrderSuccessDto;
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

    private final RestTemplate restTemplate;

    @Override
    public OrderDto createOrder(OrderDto orderDto) {

        var toolOrderDto = new ToolOrderDto(orderDto.getCount());
        HttpEntity<ToolOrderDto> httpEntity = new HttpEntity<>(toolOrderDto);

        var result = restTemplate.exchange(URI.create("http://127.0.0.1:8082/tool/" + orderDto.getToolId()), HttpMethod.PUT, httpEntity, ToolOrderSuccessDto.class);

        var successDto = result.getBody();

        if (successDto.getSuccess()) {

            var orderResult = restTemplate.postForObject("http://127.0.0.1:8083/order", orderDto, OrderDto.class);

            return orderResult;

        }

        var tool = restTemplate.getForObject("http://127.0.0.1:8082/tool/" + orderDto.getToolId(), ToolDto.class);


        throw new NoCountToolException(orderDto.getToolId(), orderDto.getCount(), tool.getCount());

    }
}
