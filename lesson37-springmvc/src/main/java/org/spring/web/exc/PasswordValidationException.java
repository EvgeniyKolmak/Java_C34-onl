package org.spring.web.exc;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
public class PasswordValidationException extends RuntimeException {

    private String password;

    public PasswordValidationException(String password) {
        this.password = password;
    }

}
