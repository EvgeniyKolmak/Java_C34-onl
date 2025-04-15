package org.example;

import org.example.domain.*;

import java.util.*;

public class MainOpt {

    public static void main(String[] args) {

        String text = """
                Hello World!
                    Java
                        !!!!
                """;
        System.out.println(text);

//        var animals = new HashMap<String, Animal>();
//
//        for (var anim : animals.entrySet()) {
//
//        }
//
//        var animal = new Animal();
//
//        List<String> list = new ArrayList<String>();
//
//        animal.getName()
//                .map(String::toUpperCase)
//                .ifPresent(System.out::println);

//        Animal animal = new Animal("barsik");
//
//        Optional.ofNullable(animal.getName())
//                        .map(String::toUpperCase)
//                                .ifPresent(System.out::println);

//        System.out.println(animal.getName().toUpperCase());

        Galaxy galaxy = new Galaxy();

//        Optional<Object> empty = Optional.empty();
//        Optional<Object> o = Optional.of(galaxy);
//        Optional<Galaxy> galaxy3 = Optional.ofNullable(null);

        Galaxy galaxy1 = Optional.ofNullable(galaxy)
                .orElse(new Galaxy());

        Galaxy galaxy2 = Optional.ofNullable(galaxy)
                .orElseGet(() -> new Galaxy());

//
//        Galaxy galaxy = new Galaxy("galaxy",
//                new Systemz("systemz",
//                        new Planet("planet",
//                                new Country("country",
//                                        new Adress("Minsk, lenina 20")))));

//        Optional.ofNullable((Integer)null)
//                .filter(v -> v < 10)
//                .map(v -> v * v)
//                .ifPresent(System.out::println);

//        Optional.ofNullable(galaxy)
//                .ifPresentOrElse(System.out::println, () -> System.out.println("Galaxy is empty"));
//
//        Galaxy galaxy1 = Optional.ofNullable(galaxy)
//                .orElse(new Galaxy());


//        Galaxy galaxy = new Galaxy("galaxy",
//                new Systemz("systemz", null));

//        String noAdress = Optional.ofNullable(galaxy)
//                .map(Galaxy::getSystemz)
//                .map(Systemz::getPlanet)
//                .map(Planet::getCountry)
//                .map(Country::getAdress)
//                .map(Adress::getName)
//                .orElse("no adress");
//
//        System.out.println(noAdress);


//        String add = null;
//
//        if (galaxy != null) {
//            Systemz systemz = galaxy.getSystemz();
//
//            if (systemz != null) {
//
//                Planet planet = systemz.getPlanet();
//
//                if (planet != null) {
//
//                    Country country = planet.getCountry();
//
//                    if (country != null) {
//
//                        Adress adress = country.getAdress();
//
//                        if (adress != null) {
//
//                            add = adress.getName();
//                        }
//
//                    }
//
//                }
//
//            }
//
//        }
//
//        System.out.println(add == null ? "no adress" : add);

    }

}
