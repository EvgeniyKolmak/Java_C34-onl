package org.spring.mvc.lesson44springdata.repository;

import org.spring.mvc.lesson44springdata.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {

//    List<PersonEntity> findByLogin(String login);

    List<PersonEntity> findByLoginAndPassword(String login, String password);

    List<PersonEntity> findByLoginOrPassword(String login, String password);

    List<PersonEntity> findByAgeBetween(Integer from, Integer to);

    List<PersonEntity> findByLoginContains(String login);

    List<PersonEntity> findByLoginContainsOrderByAge(String login);
    List<PersonEntity> findByLoginContainsOrderByAgeDesc(String login);

    List<PersonEntity> findByLoginAndPasswordAndAgeBetweenOrderByAgeDesc(String login, String password, Integer from, Integer to);

    Optional<PersonEntity> findByLogin(String login);

    @Query(value = "from PersonEntity where login = :login and password = :pass order by age desc ")
    List<PersonEntity> findSomePersons(String login, String pass);

    @Query(value = "select * from persons where login = :login and password = :pass", nativeQuery = true)
    List<PersonEntity> findSomePersonsSQL(String login, String pass);

    List<PersonEntity> findSomePersonsNamedQuery(String login, String pass);


}
