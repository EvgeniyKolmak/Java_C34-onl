package org.spring.mvc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "persons")
@Getter @Setter
public class PersonEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private String name;

}
