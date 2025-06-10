package org.example.service;

import org.example.config.HibernateFactory;
import org.example.entity.PersonEntity;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.UUID;

public class PersonService {

    private static final SessionFactory factory = HibernateFactory
            .getSessionFactory();

    public PersonEntity save(PersonEntity personEntity) {

        var session = factory.openSession();
        var transaction = session.beginTransaction();

        session.persist(personEntity);
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

        entity.setPassword(newPassword);
        entity.setSalary(4000);

        transaction.commit();
        session.close();

        return entity;
    }

}
