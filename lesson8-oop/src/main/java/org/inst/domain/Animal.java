package org.inst.domain;

import org.inst.service.EatService;

public abstract class Animal implements EatService {

    public void eat() {
        System.out.println("Eat");
    }

    public abstract void addVitamin();

    public void testA() {

    }

}
