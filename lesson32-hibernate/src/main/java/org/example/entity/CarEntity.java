package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@Getter @Setter
public class CarEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "cars", fetch = FetchType.EAGER)
    private List<PersonEntity> persons = new ArrayList<>();

    public CarEntity(String name) {
        this.name = name;
    }
}
