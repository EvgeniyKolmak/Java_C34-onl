package org.spring.mvc.lesson47shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetailDto {

    private Integer errorCode;
    private String details;

}
