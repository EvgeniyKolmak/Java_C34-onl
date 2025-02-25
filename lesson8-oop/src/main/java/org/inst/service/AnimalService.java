package org.inst.service;

import org.inst.domain.Animal;
import org.inst.domain.Cat;

public class AnimalService {

    public void processEatAnimal(EatService animal) {
        animal.eat();

//        if (animal instanceof Cat cat) {
//            cat.addVitamin();
//        }

    }

}
