package com.lesson16;

public class MethodRefMain {

    public static void main(String[] args) {

        MathService max = Math::max;

        StringFormatter upper = String::toUpperCase;

        StringFormatter trim = String::trim;

        StringFormatter trimUpper = str -> str.trim().toUpperCase();

        System.out.println(upper.format("hello"));



//        (v1, v2) -> return Math.max(v1, v2)
//        Math::max

    }

}
