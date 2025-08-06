package org.spring.mvc.lesson47tool.repository;

import org.spring.mvc.lesson47tool.domain.ToolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ToolRepository extends JpaRepository<ToolEntity, UUID> {
}
