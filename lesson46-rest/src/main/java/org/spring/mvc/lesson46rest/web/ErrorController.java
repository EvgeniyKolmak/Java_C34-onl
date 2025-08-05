package org.spring.mvc.lesson46rest.web;

import org.spring.mvc.lesson46rest.dto.ErrorDto;
import org.spring.mvc.lesson46rest.exc.ProfileNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(ProfileNotFoundException.class)
    public ResponseEntity<ErrorDto> handleProfileNotFoundException(ProfileNotFoundException ex) {
        return ResponseEntity.status(404)
                .body(new ErrorDto("Profile not found", ex.getProfile()));
    }

}
