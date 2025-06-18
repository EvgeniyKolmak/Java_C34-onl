package org.example.service;

import org.example.config.HibernateFactory;
import org.example.dto.AuthDto;
import org.example.dto.PersonPageDto;
import org.example.dto.SearchDto;
import org.example.entity.CarEntity;
import org.example.entity.PersonEntity;
import org.example.entity.Person_;
import org.example.entity.PhoneEntity;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

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

    public PersonEntity findByLogin(String login) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();
// select * from tableName ....
        PersonEntity entity = session.createQuery("from PersonEntity where login = :username", PersonEntity.class)
                        .setParameter("username", login)
                                .getSingleResult();

        transaction.commit();
        session.close();

        return entity;
    }

    public List<PersonEntity> findUpdatedUser() {
        var session = factory.openSession();
        var transaction = session.beginTransaction();
// select * from tableName ....
        List<PersonEntity> entities = session.createQuery("from PersonEntity JOIN cars where version > :initVersion", PersonEntity.class)
                .setParameter("initVersion", 0)
                .getResultList();

        transaction.commit();
        session.close();

        return entities;
    }

    public Long count() {
        var session = factory.openSession();
        var transaction = session.beginTransaction();
// select * from tableName ....
        Long count = session.createQuery("select count(*) from PersonEntity", Long.class)
                .getSingleResult();

        transaction.commit();
        session.close();

        return count;
    }

    public void countByPass() {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        List<Object[]> count = session.createQuery("select password, count(*) from PersonEntity group by password having count(*) > 1")
                .getResultList();

        for (Object[] o : count) {
            System.out.println(o[0] + " : " + o[1]);
        }

//        System.out.println(count);

        transaction.commit();
        session.close();
    }

    public List<PersonEntity> findByName(String name) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();
// %name   name%   %name%
        List<PersonEntity> persons = session.createQuery("from PersonEntity where login like :pattern")
                .setParameter("pattern", "%" + name + "%")
                .getResultList();


//        System.out.println(count);

        transaction.commit();
        session.close();
        return persons;
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

    public List<String> findUniqNames() {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var results = session.createQuery("select distinct login from PersonEntity", String.class)
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

    public List<AuthDto> getAllAuth() {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var all = session.createQuery("select new org.example.dto.AuthDto(p.login, p.password) from PersonEntity p", AuthDto.class)
                        .getResultList();

        transaction.commit();
        session.close();

        return all;
    }

    public void deleteByName(String name) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        int count = session.createQuery("delete from PersonEntity where login = :name")
                .setParameter("name", name)
                .executeUpdate();

        System.out.println(count);

        transaction.commit();
        session.close();
    }

    public void updatePass(String name, String newPassword) {

        var session = factory.openSession();
        var transaction = session.beginTransaction();

        int result = session.createQuery("Update PersonEntity set password = :pass where login = :name")
                        .setParameter("pass", newPassword)
                                .setParameter("name", name)
                                        .executeUpdate();

        System.out.println(result);

        transaction.commit();
        session.close();
    }

    public PersonPageDto findByPage(int page, int size) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var count = session.createQuery("select count(*) from PersonEntity", Long.class)
                .getSingleResult();

        var all = session.createQuery("from PersonEntity left join fetch cars order by login", PersonEntity.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();

        transaction.commit();
        session.close();

        return new PersonPageDto(count.intValue(), all);
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

    public List<PersonEntity> search(SearchDto searchDto) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var builder = session.getCriteriaBuilder();

        var query = builder.createQuery(PersonEntity.class);

        var root = query
                .from(PersonEntity.class);

        List<JpaPredicate> predicates = new ArrayList<>();

        List<JpaPredicate> orLoginPass = new ArrayList<>();

        if (searchDto.getLogin() != null) {
            var loginEq = builder.equal(root.get(Person_.login), searchDto.getLogin());
            orLoginPass.add(loginEq);
        }

        if (searchDto.getPassword() != null) {
            var passEq = builder.equal(root.get(Person_.password), searchDto.getPassword());
            orLoginPass.add(passEq);
        }

        if (!orLoginPass.isEmpty()) {
            var orPredic = builder.or(orLoginPass.toArray(new JpaPredicate[0]));
            predicates.add(orPredic);
        }

        if (searchDto.getFromVersion() != null) {
            var verGt = builder.greaterThanOrEqualTo(root.get("version"), searchDto.getFromVersion());
            predicates.add(verGt);
        }

        if (searchDto.getToVersion() != null) {
            var verLs = builder.lessThanOrEqualTo(root.get("version"), searchDto.getToVersion());
            predicates.add(verLs);
        }

        query.where(predicates.toArray(new JpaPredicate[0]));

        var result = session.createQuery(query)
                .getResultList();

        transaction.commit();
        session.close();

        return result;
    }

}
