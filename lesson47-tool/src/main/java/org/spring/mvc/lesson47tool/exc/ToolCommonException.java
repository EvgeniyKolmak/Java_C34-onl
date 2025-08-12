package org.spring.mvc.lesson47tool.exc;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ToolCommonException extends RuntimeException {

    private Integer errorCode;
    private String details;

}
