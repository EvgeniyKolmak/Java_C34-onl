package org.example.service;

import org.example.config.HibernateFactory;
import org.example.entity.AddressEntity;
import org.example.entity.PhoneEntity;
import org.hibernate.SessionFactory;

import java.util.UUID;

public class PhoneService {

    private static final SessionFactory factory = HibernateFactory
            .getSessionFactory();

    public PhoneEntity findById(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(PhoneEntity.class, id);
        transaction.commit();
        session.close();

        return entity;
    }

}
