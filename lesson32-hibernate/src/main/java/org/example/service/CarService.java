package org.example.service;

import org.example.config.HibernateFactory;
import org.example.entity.CarEntity;
import org.example.entity.PhoneEntity;
import org.hibernate.SessionFactory;

import java.util.UUID;

public class CarService {

    private static final SessionFactory factory = HibernateFactory
            .getSessionFactory();

    public CarEntity findById(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(CarEntity.class, id);
        transaction.commit();
        session.close();

        return entity;
    }
}
