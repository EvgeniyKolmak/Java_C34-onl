package org.example.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLoggerConfiguration {

    @Pointcut("execution(* *..*(..))")
    public void logger() {
    }

    @Before("logger()")
    public void printLine() {
        System.out.println(" ------------ ");
    }

}
