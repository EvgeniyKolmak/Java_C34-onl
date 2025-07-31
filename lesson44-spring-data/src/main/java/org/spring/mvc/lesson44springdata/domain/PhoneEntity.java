package org.spring.mvc.lesson44springdata.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "phones")
@Getter @Setter
public class PhoneEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private Long number;

    @JoinColumn(name = "person_id")
    @ManyToOne
    private PersonEntity person;

    public PhoneEntity() {
    }
}
