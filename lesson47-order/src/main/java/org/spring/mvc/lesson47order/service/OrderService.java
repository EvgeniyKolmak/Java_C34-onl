package org.spring.mvc.lesson47order.service;

import org.spring.mvc.lesson47order.dto.OrderDto;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    OrderDto save(OrderDto dto);

    List<OrderDto> findAll(UUID userId);

}
