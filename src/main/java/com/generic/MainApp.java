package com.generic;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        // C ex B ex A ex Object
        List<? super B> bLits = new ArrayList<>();
//              List<B>
//              List<A>
//              List<Object>

        // bList.add(C)

        // List<B>
        // List<C>
        // List<extend B>
        // List<G>

        A a = new A();
        B b = new B();
        C c = new C();

        List<? extends B> aList = List.of(c, b);

        bLits.add(b);
        bLits.add(c);

        Object object = bLits.get(1);
        B b1 = aList.get(1);

//        aList.add(a);

        // PECS - Producer - extend, Consumer - super

    }

}
