package org.spring.mvc.lesson47tool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorDto {

    private Integer errorCode;
    private String details;

}
