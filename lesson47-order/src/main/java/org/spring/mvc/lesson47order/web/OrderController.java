package org.spring.mvc.lesson47order.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47order.dto.OrderDto;
import org.spring.mvc.lesson47order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    @PostMapping
    public OrderDto save(@RequestBody OrderDto orderDto) {
        return service.save(orderDto);
    }

    @GetMapping("/{userId}")
    public List<OrderDto> findAll(@PathVariable(name = "userId") UUID userId) {
        return service.findAll(userId);
    }

}
