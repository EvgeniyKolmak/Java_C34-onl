package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class AddressEntity {

    @Id
    @UuidGenerator
    private UUID id;
    private String city;
    private String street;
    @OneToOne(mappedBy = "address")
    @ToString.Exclude
    private PersonEntity person;

    public AddressEntity(String city, String street) {
        this.city = city;
        this.street = street;
    }
}
