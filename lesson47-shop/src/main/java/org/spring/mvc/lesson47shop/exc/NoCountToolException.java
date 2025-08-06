package org.spring.mvc.lesson47shop.exc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor @AllArgsConstructor
public class NoCountToolException extends RuntimeException {

    private UUID toolId;
    private Integer count;
    private Integer existCount;

}
