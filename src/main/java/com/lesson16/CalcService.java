package com.lesson16;

public class CalcService {

    public void printSum(int value1, int value2, MathService mathService) {
        var result = mathService.calc(value1, value2);
        System.out.println(result);
    }

    public void printMult(int value1, int value2, MathService mathService) {
        var result = mathService.calc(value1, value2);
        System.out.println(result);
    }

    public void printMax(int value1, int value2, MathService mathService) {
        var result = mathService.calc(value1, value2);
        System.out.println(result);
    }

}
