package org.spring.mvc.lesson47users.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "persons")
@Entity
public class PersonEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private String login;

    private Boolean blocked;

}
