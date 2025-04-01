package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

        strList.add("Hello");
        strList.add("World");
        strList.add("el1");
        strList.add("el2");
        strList.add("el3");
        strList.add("el4");
        strList.add("el3");
        strList.add("el4");
        strList.add("el3");
        strList.add("el4");
        strList.add("el3");
        strList.add("el4");
        strList.add("el3");
        strList.add("el4");
        strList.add("el3");
        strList.add("el4");

        strList.add(1, "My");
        strList.remove(0);

        System.out.println(strList);

        String el = strList.get(1);
        System.out.println(el);

        List<String> strings = strList.subList(1, 3);
        System.out.println(strings);

//        for (int i = 0; i < strList.size(); i++) {
//            String s = strList.get(i);
//        }

//        System.out.println(strList.size());
//        System.out.println(strList.contains("World"));
//        System.out.println(strList.remove("World"));
//        System.out.println(strList);
//        System.out.println(strList.isEmpty());
//        strList.clear();
//
//        System.out.println(strList);

        int counter = 0;

        for (String elStr : strList) {
            if (elStr.length() > 4) {
                counter++;
            }
        }

        System.out.println(counter);

//        Iterator<String> iterator = strList.iterator();
//
//        int counter = 0;
//
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//
//            if (next.length() > 4) {
//                counter++;
//            }
//
//            System.out.println(next.toUpperCase());
//        }

        System.out.println(counter);

    }
}

                // arraylist      linkedlist         hashset                treeset
// add               O(n)          O(n) O(1)        O(1) O(n) O(lgn)         O(lgn)
// remove            O(n)          O(n) O(1)        O(1) O(n) O(lgn)         O(lgn)
// search            O(n)          O(n)             O(1) O(n) O(lgn)         O(lgn)
// get by id         O(1)          O(n)             ---
