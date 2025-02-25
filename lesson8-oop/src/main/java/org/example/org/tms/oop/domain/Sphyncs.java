package org.example.org.tms.oop.domain;

public class Sphyncs extends Cat {

    public Sphyncs() {
        super("sadasdas");
        System.out.println("Sphyncs constructor");
    }

    public Sphyncs(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Sphyncs say");
    }

    public String getName() {
        return "Sphyncs";
    }

    public void playKlubok() {
        System.out.println("Klubok");
    }
}
