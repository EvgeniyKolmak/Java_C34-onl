package org.example;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainQueue {

    public static void main(String[] args) {

        // QUEUE = FIFO - first in -> first out
        // Stack = FILO - first in -> last out

        Stack<String> stack = new Stack<>();
        stack.push("item1");
        stack.push("item2");
        stack.push("item3");
        stack.push("item4");

        System.out.println(stack);

//        String peek = stack.peek();
//        System.out.println(peek);

        String pop = stack.pop();
        System.out.println(pop);

        System.out.println(stack);

//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("item1");
//        queue.add("item2");
//        queue.add("item3");
//        queue.add("item4");
//
//        System.out.println(queue);
//
////        String peek = queue.peek(); // не удаляет
//        String poll = queue.poll();
//        System.out.println(poll);
//
//        System.out.println(queue);


    }

}
