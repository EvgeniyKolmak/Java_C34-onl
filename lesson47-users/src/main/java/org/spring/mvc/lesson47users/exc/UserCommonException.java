package org.spring.mvc.lesson47users.exc;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserCommonException extends RuntimeException {

    private Integer code;
    private String message;

}
