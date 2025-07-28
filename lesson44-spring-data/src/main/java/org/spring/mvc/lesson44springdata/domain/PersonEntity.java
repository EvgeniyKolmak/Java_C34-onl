package org.spring.mvc.lesson44springdata.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Table(name = "persons")
@Entity

@NoArgsConstructor
@Getter @Setter
@NamedQuery(name = "PersonEntity.findSomePersonsNamedQuery", query = "from PersonEntity where login = :login and password = :pass order by age desc ")
public class PersonEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private String login;
    private String password;

    private Integer age;

}
