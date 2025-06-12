package org.example.service;

import org.example.config.HibernateFactory;
import org.example.entity.CarEntity;
import org.example.entity.PersonEntity;
import org.example.entity.PhoneEntity;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.UUID;

public class PersonService {

    private static final SessionFactory factory = HibernateFactory
            .getSessionFactory();

    public PersonEntity save(PersonEntity personEntity) {

        var session = factory.openSession();
        var transaction = session.beginTransaction();

//        session.persist(personEntity.getAddress());

//        var phones = personEntity.getPhones();

        session.persist(personEntity);

//        for (PhoneEntity phoneEntity : phones) {
//            session.persist(phoneEntity);
//        }

        transaction.commit();
        session.close();

        return personEntity;
    }

    public PersonEntity saveWithCar(PersonEntity personEntity, UUID carId) {

        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var car = session.find(CarEntity.class, carId);
        personEntity.addCar(car);

//        session.persist(personEntity.getAddress());

//        var phones = personEntity.getPhones();

        session.persist(personEntity);

//        for (PhoneEntity phoneEntity : phones) {
//            session.persist(phoneEntity);
//        }

        transaction.commit();
        session.close();

        return personEntity;
    }

    public PersonEntity findById(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(PersonEntity.class, id);

        transaction.commit();
        session.close();

        return entity;
    }

    public List<PersonEntity> findAll() {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var results = session.createQuery("from PersonEntity", PersonEntity.class)
                .getResultList();
        transaction.commit();
        session.close();

        return results;
    }

    public PersonEntity updatePassword(UUID id, String newPassword) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(PersonEntity.class, id);

        session.lock(entity, LockMode.READ);

        entity.setPassword(newPassword);

        transaction.commit();
        session.close();

        return entity;
    }

    public PersonEntity delete(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(PersonEntity.class, id);

        session.remove(entity);

        transaction.commit();
        session.close();

        return entity;

    }

}
