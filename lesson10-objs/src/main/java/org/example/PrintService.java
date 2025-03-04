package org.example;

public class PrintService {

    @RunMe(count = 1)
    @Deprecated
    public void print1() {
        System.out.println("Hello World1");
    }

    public void print2() {
        System.out.println("Hello World2");
    }

    @RunMe(count = 3)
    public void print3() {
        System.out.println("Hello World3");
    }

    @RunMe(count =  10)
    public void print4() {
        System.out.println("Hello World4");
    }

}
