package org.example.org.tms.oop.domain;

public class Cat extends Animal {

    public Cat(String text) {
        super(12);
        System.out.println("Cat constructor");
    }

    public void say() {
        super.say();
        System.out.println("My name is Myrka");
    }

    public void playKlubok() {
        System.out.println("Klubok");
    }

}

