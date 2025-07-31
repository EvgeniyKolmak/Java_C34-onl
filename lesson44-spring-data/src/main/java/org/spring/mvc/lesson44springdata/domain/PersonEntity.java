package org.spring.mvc.lesson44springdata.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Table(name = "persons")
@Entity

@Getter @Setter
@NamedQuery(name = "PersonEntity.findSomePersonsNamedQuery", query = "from PersonEntity where login = :login and password = :pass order by age desc ")
public class PersonEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private String login;
    private String password;

    private Integer age;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "person")
    private List<PhoneEntity> phones;

    public PersonEntity() {
    }
}
