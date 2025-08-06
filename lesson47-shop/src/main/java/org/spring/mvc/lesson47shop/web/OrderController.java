package org.spring.mvc.lesson47shop.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.OrderDto;
import org.spring.mvc.lesson47shop.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public OrderDto save(@RequestBody OrderDto dto) {
        return orderService.createOrder(dto);
    }

}
