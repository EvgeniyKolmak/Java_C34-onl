package org.spring.mvc.lesson47order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.spring.mvc.lesson47order.domain.OrderEntity;
import org.spring.mvc.lesson47order.dto.OrderDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDto toDto(OrderEntity person);

    @Mapping(target = "status", constant = "NEW")
    OrderEntity toEntity(OrderDto dto);

    List<OrderDto> toDtos(List<OrderEntity> all);
}
