package org.spring.mvc.lesson47order.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47order.dto.OrderDto;
import org.spring.mvc.lesson47order.mapper.OrderMapper;
import org.spring.mvc.lesson47order.repository.OrderRepository;
import org.spring.mvc.lesson47order.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repo;
    private final OrderMapper mapper;

    @Override
    public OrderDto save(OrderDto dto) {
        var entity = mapper.toEntity(dto);

        var result = repo.save(entity);

        return mapper.toDto(result);
    }

    @Override
    public List<OrderDto> findAll(UUID userId) {
        return mapper.toDtos(repo.findAllByUserId(userId));
    }

}
