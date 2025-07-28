package org.spring.mvc.lesson44springdata.repository;

import org.spring.mvc.lesson44springdata.domain.AddresEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddresRepository extends JpaRepository<AddresEntity, UUID> {
}
