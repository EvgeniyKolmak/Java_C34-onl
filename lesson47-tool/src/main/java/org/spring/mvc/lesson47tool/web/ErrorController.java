package org.spring.mvc.lesson47tool.web;

import org.spring.mvc.lesson47tool.dto.ErrorDto;
import org.spring.mvc.lesson47tool.exc.ToolCommonException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(ToolCommonException.class)
    public ResponseEntity<ErrorDto> handle(ToolCommonException exc) {

        var errorDto = new ErrorDto(exc.getErrorCode(), exc.getDetails());

        return ResponseEntity.badRequest()
                .body(errorDto);
    }

}
