package org.inst;

import org.inst.domain.Animal;
import org.inst.domain.Cat;
import org.inst.domain.Dog;
import org.inst.service.AnimalService;

public class MainApp {

    public static void main(String[] args) {

        Animal vaska = new Cat();
        Animal polkan = new Dog();

        AnimalService service = new AnimalService();

        service.processEatAnimal(vaska);
        service.processEatAnimal(polkan);


    }

}
