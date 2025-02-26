package org.example;

public class OuTClass {

    public void runOut() {
        InClass inClass = new InClass();
        inClass.runIn();
    }

    public static void runOutStatic() {

    }

    public static class InClass {

        public void runIn() {
            runOutStatic();
        }

    }

}
