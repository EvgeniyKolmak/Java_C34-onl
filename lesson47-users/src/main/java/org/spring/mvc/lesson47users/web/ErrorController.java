package org.spring.mvc.lesson47users.web;

import org.spring.mvc.lesson47users.dto.ErrorDto;
import org.spring.mvc.lesson47users.exc.UserCommonException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(UserCommonException.class)
    public ResponseEntity<ErrorDto> handleException(UserCommonException ex) {
        var errorDto = new ErrorDto(ex.getCode(), ex.getMessage());

        return ResponseEntity.status(400)
                .body(errorDto);
    }


}
