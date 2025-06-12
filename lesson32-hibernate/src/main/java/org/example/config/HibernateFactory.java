package org.example.config;

import org.example.entity.AddressEntity;
import org.example.entity.PersonEntity;
import org.example.entity.PhoneEntity;
import org.example.entity.CarEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateFactory {

    public static SessionFactory getSessionFactory() {

        Properties properties = new Properties();
        properties.put("hibernate.connection.url", "jdbc:postgresql://192.168.1.59:5432/hib");
        properties.put("hibernate.connection.username", "postgres");
        properties.put("hibernate.connection.password", "postgres");
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");

        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");

        var configuration = new Configuration()
                .addAnnotatedClass(PersonEntity.class)
                .addAnnotatedClass(AddressEntity.class)
                .addAnnotatedClass(PhoneEntity.class)
                .addAnnotatedClass(CarEntity.class)
                .addProperties(properties);

        return configuration
                .buildSessionFactory();
    }

}
