package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        boolean isOk = false;
//
//        while (!isOk) {
//            try {
//                Scanner scanner = new Scanner(System.in);
//                int value = scanner.nextInt();
//                isOk = true;
//            } catch (Exception exc) {
//                System.out.println("Wrong number");
//            }
//        }

        UserService service = new UserService();

        try {
            int sum = service.sum(10, 20);
        } catch (NumberWrongException exc) {
            System.out.println("Number " + exc.getValue() + " is negative");
        }

//
//        int sum = 0;
//
//        try {
//
//            int[] arr = new int[2];
//            arr[2] = 10;
//
//            sum = service.sum(10, -20);
//            System.out.println(sum);
//        } catch (NumberWrongException exc) {
//            System.out.println("Please use positive values");
//        } catch (Exception exc) {
//            System.out.println("ignore");
//        }
//
//
//        System.out.println(sum);

    }


}