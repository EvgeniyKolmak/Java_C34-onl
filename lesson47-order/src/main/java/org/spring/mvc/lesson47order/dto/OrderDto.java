package org.spring.mvc.lesson47order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class OrderDto {

    private UUID id;

    private UUID userId;

    private UUID toolId;

    private Integer count;

    private Status status;

    public enum Status {
        NEW,
        IN_PROGRESS,
        DONE
    }

}
