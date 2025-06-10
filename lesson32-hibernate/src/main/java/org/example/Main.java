package org.example;

import org.example.config.HibernateFactory;
import org.example.entity.Address;
import org.example.entity.PersonEntity;
import org.example.entity.Phone;
import org.example.entity.Prof;
import org.example.service.PersonService;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class Main {

    private static final PersonService service = new PersonService();

    public static void main(String[] args) {

        var address = new Address("Minsk", "Cosmonavtov");
        var phone1 = new Phone(123L, "A1");
        var phone2 = new Phone(456L, "MTS");
        var person = new PersonEntity("user1", "password1", 3000, true, Prof.DIRECTOR, Instant.now(), address, phone1, phone2);
        var saved = service.save(person);

        service.updatePassword(saved.getId(), "password3");

    }

}