package org.spring.mvc.lesson47shop.web;

import org.spring.mvc.lesson47shop.dto.ErrorDto;
import org.spring.mvc.lesson47shop.exc.NoCountToolException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ShopExceptionController {

    @ExceptionHandler(NoCountToolException.class)
    public ResponseEntity<ErrorDto> handleNoCountToolException(NoCountToolException exc) {

        return ResponseEntity.status(400).body(new ErrorDto("no needed count of tools", exc.getToolId(), exc.getCount(), exc.getExistCount()));

    }

}
