package org.example.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectBenchmarkConfiguration {

    @Pointcut("@annotation(org.example.config.Timer)")
    public void point() {}

    @Around("point()")
    public Object calculate(ProceedingJoinPoint joinPoint) throws Throwable {

        var methodName = getMethodName(joinPoint);

        var start = System.nanoTime();

        var result = joinPoint.proceed();

        var end = System.nanoTime();
        System.out.println("Method: " + methodName + " execution takes: " + (end - start));

        return result;
    }

    @Before("point()")
    public void printStart(JoinPoint joinPoint) {
        var methodName = getMethodName(joinPoint);
        System.out.println("Start of method: " + methodName);
    }

    @After("point()")
    public void printEnd(JoinPoint joinPoint) {
        var methodName = getMethodName(joinPoint);
        System.out.println("End of method: " + methodName);
    }

    private String getMethodName(JoinPoint joinPoint) {
        return joinPoint.getSignature().getDeclaringType().getSimpleName() + "." + joinPoint.getSignature().getName();
    }

}
