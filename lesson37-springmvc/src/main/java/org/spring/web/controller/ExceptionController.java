package org.spring.web.controller;

import org.spring.web.exc.AgeValidationException;
import org.spring.web.exc.UnexpectedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(UnexpectedException.class)
    public String processUnexpected() {
        return "error3";
    }

    @ExceptionHandler(Exception.class)
    public String processException(Exception exc) {
        System.out.println(exc.getMessage());
        return "error4";
    }

    @ExceptionHandler(AgeValidationException.class)
    public ModelAndView processAgeError(AgeValidationException ex) {

        ModelAndView model = new ModelAndView("error1");

        model.addObject("age", ex.getProfile().getAge());
        System.out.println(ex.getProfile());
        return model;
    }

}
