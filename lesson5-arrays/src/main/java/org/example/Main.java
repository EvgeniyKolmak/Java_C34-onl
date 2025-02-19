package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

//        Arrays.fill(arr, -10);
//
//        System.out.println(Arrays.toString(arr));

//        int [][] arr = new int[3][];
//
//        arr[0] = new int[]{1,2,3};
//        arr[1] = new int[]{4,1,2,3};
//        arr[2] = new int[]{2,3,7,2,3};
//
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            int[] innerArr = arr[i];
//
//            for (int j = 0; j < innerArr.length; j++) {
//                if (innerArr[j] == 7) {
//                    found = true;
//                }
//            }
//
//        }
//
//        System.out.println(found);
//
//        System.out.println(Arrays.deepToString(arr));


//        int [] arr1 = {3,2,1,4,5};

//        Arrays.sort(arr1);
//        int result = Arrays.binarySearch(arr1, 12);
//        Arrays.fill(arr1, 12);

//        System.out.println(result);

//        int [] arr2 = new int[arr1.length + 1];
//
//        System.arraycopy(arr1, 3, arr2, 1, 2);
//
//        System.out.println(Arrays.toString(arr2));

//        int [] arr2 = new int[arr1.length + 1];
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//
//        arr2[arr2.length - 1] = 100;
//
//        System.out.println(Arrays.toString(arr2));

//        int[] arr = {5,3,4, 12, 10, 8};
//
//        for (int el : arr) {
//
//            if (el % 2 == 0) {
//                System.out.println(el);
//            }
//
//        }
//
//        int temp;
//
//        for (int j = 0; j < arr.length; j++) {
//
//            boolean isSwap = false;
//
//            for (int i = 0; i < arr.length - 1 - j; i++) {
//                if (arr[i] > arr[i+1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                    isSwap = true;
//                }
//            }
//
//            if (!isSwap) {
//                break;
//            }
//        }
//
//
//        System.out.println(Arrays.toString(arr));

//        int sum = 0;
//
//        for(int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//
//        System.out.println(sum/arr.length);

//        int min = arr[0];
//
//        for(int el : arr) {
//            if (el < min) {
//                min = el;
//            }
//        }

//        System.out.println(min);

//        int findNumber = 2;
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == findNumber) {
//                found = true;
//                break;
//            }
//        }

//        System.out.println(found ? "Found" : "Not found");


//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] + 1;
//        }

//        for (int el : arr) {
//            System.out.println(el);
//        }

//        System.out.println(Arrays.toString(arr));

//        Arrays.fill(arr, 5);
//
//        int i = 0;
//
//        while (i < arr.length) {
//            arr[i] = i;
//            i++;
//        }
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr.length);

    }
}