package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "phones")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString
public class PhoneEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private Long number;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @ToString.Exclude
    private PersonEntity person;

    public PhoneEntity(Long number) {
        this.number = number;
    }
}
