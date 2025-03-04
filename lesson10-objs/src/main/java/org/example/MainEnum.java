package org.example;

import java.util.Arrays;

public class MainEnum {

    public static void main(String[] args) {

        System.out.println(Brand.VOLVO.ordinal());
        System.out.println(Brand.VOLVO.name());
        System.out.println(Arrays.toString(Brand.values()));
        System.out.println(Brand.valueOf("VOLVO"));

    }

}
