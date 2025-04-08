package org.example;

public class CatService implements AnimalService <Cat> {

    @Override
    public void play(Cat animal) {
    }

    @Override
    public Cat get() {
        return null;
    }

    @Override
    public void eat(Cat animal) {
    }
}
