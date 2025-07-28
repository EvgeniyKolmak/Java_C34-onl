package org.spring.mvc.lesson44springdata.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Table(name = "addres")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class AddresEntity {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String street;

}
