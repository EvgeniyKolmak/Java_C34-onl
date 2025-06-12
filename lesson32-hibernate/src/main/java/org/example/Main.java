package org.example;

import org.example.entity.CarEntity;
import org.example.entity.PersonEntity;
import org.example.service.AddressService;
import org.example.service.CarService;
import org.example.service.PersonService;
import org.example.service.PhoneService;

import java.util.UUID;

public class Main {

    private static final PersonService service = new PersonService();
    private static final AddressService addressService = new AddressService();
    private static final PhoneService phoneService = new PhoneService();
    private static final CarService carService = new CarService();

    public static void main(String[] args) {

//        var car = carService.findById(UUID.fromString("bb429f7e-ebab-43fc-baf9-e80d9eda0f23"));

        PersonEntity person = new PersonEntity("test10", "test2");

//        person.addCar(car);

//        service.saveWithCar(person, UUID.fromString("bb429f7e-ebab-43fc-baf9-e80d9eda0f23"));
//        var address = new AddressEntity("Minsk", "Cosmonavtov");
//        var person = new PersonEntity("user4", "password1");
//        var phone1 = new PhoneEntity(456789123400L);
//        var phone2 = new PhoneEntity(123456789000L);
//
//        var car = new CarEntity("volvo");
//
//        person.setAddress(address);
//        address.setPerson(person);
//        person.addPhone(phone1);
//        person.addPhone(phone2);
//        person.addCar(car);
//
//        var saved = service.save(person);


//        var byId = service.findById(UUID.fromString("e5c3ac8b-6926-4156-91a0-a175c0f0a9b7"));

        service.updatePassword(UUID.fromString("4cfac9e3-ee6d-4554-b77a-cd8b950bf671"), "testPass11");

//        var byId = service.findById(UUID.fromString("eadda26a-cf5c-4739-9ce2-5fec11962a35"));

//        var person = service.findById(UUID.fromString("eadda26a-cf5c-4739-9ce2-5fec11962a35"));
//
//        System.out.println(person);

//        System.out.println("   ------------------    ");
//        System.out.println(person.getPhones().get(0).getNumber());


    }

}