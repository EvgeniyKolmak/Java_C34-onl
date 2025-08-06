package org.spring.mvc.lesson47order.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.spring.mvc.lesson47order.dto.OrderDto;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "orders")
@Entity
public class OrderEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private UUID userId;

    private UUID toolId;

    private Integer count;

    @Enumerated(EnumType.STRING)
    private OrderDto.Status status;

}
