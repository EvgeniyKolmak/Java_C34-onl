package org.spring.mvc.lesson47users.repository;

import org.spring.mvc.lesson47users.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {
    PersonEntity findByLogin(String login);
}
