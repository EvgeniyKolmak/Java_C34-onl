package org.example;

import java.util.List;

public interface AnimalService <T extends Animal> {

    void play(T animal);

    T get();

    void eat(T animal);

}
