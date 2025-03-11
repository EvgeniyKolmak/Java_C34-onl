package org.example;

import java.io.InputStream;

public class MainLoaderCar {

    public static void main(String[] args) throws Exception {

        Runtime runtime = Runtime.getRuntime();

        Process exec = runtime.exec("javac /Users/sergey/Car.java");

        InputStream errorStream = exec.getErrorStream();

        int i = exec.waitFor();

        if (i != 0) {
            byte[] bytes = errorStream.readAllBytes();

            String s = new String(bytes);
            System.out.println(s);

        }

        System.out.println(i);

    }

}
