package org.example;

import java.io.*;

public class MainSymbol {

    public static void main(String[] args) {

//        try (LineNumberReader reader = new LineNumberReader(new FileReader("/Users/sergey/my.txt"))) {
//
//            String s = reader.readLine();
//
//            while (s != null) {
//                System.out.println(s);
//                s = reader.readLine();
//            }
//
//        } catch (IOException exc) {
//            System.out.println(exc.getMessage());
//        }

        try (Writer writer = new BufferedWriter(new FileWriter("/Users/sergey/my2.txt"))) {
            writer.write("Hello World");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
