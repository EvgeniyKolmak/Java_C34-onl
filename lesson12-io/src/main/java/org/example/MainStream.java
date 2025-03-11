package org.example;

import java.io.*;

public class MainStream {

    public static void main(String[] args) {

        System.out.println("");

//        try (InputStream is = new BufferedInputStream(new FileInputStream("/Users/sergey/source.mp4"));
//        OutputStream os = new BufferedOutputStream(new FileOutputStream("/Users/sergey/destination.mp4"))) {
//
//            int read = is.read();
////            byte[] bytes = is.readAllBytes();
////            os.write(bytes);
//            while (read != -1) {
//
//                os.write(read);
//
//                read = is.read();
//
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (InputStream inputStream = new FileInputStream("/Users/sergey/my.csv")) {
//
//            int read = inputStream.read();
//
//            while (read != -1) {
//                System.out.print((char)read);
//                read = inputStream.read();
//            }
//
//        } catch (Exception exc) {
//            System.out.println(exc.getMessage());
//        }

        try (OutputStream os = new FileOutputStream("/Users/sergey/my_os.txt", true)) {

            String text = "Hello World!";
            byte[] bytes = text.getBytes();

            os.write(bytes);

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }

}
