package org.spring.mvc.lesson47shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ErrorDto {

    private String message;
    private UUID toolId;
    private Integer count;
    private Integer existCount;

}
