package org.spring.mvc.lesson50securityweb.repository;

import org.spring.mvc.lesson50securityweb.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {

    Optional<PersonEntity> findByUsername(String username);

}
