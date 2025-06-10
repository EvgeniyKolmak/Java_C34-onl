package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "persons")
@NoArgsConstructor
@Getter @Setter
@ToString
public class PersonEntity {

    @Id
    @UuidGenerator
    private UUID id;
    @Column(name = "username")
    private String login;
    @Column(length = 16)
    private String password;
    private Integer salary;
    @Column(name = "is_active")
    private Boolean isActive;
    @Enumerated(EnumType.STRING)
    private Prof prof;
//    @CreationTimestamp
//    private Instant created;
//    @UpdateTimestamp
//    private Instant updated;
//    @Temporal(TemporalType.DATE)
//    private Instant birthday;
    @Embedded
    private Address address;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "number", column = @Column(name = "first_number")),
            @AttributeOverride(name = "company", column = @Column(name = "first_company"))
    })
    private Phone firstPhone;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "number", column = @Column(name = "second_number")),
            @AttributeOverride(name = "company", column = @Column(name = "second_company"))
    })
    private Phone secondPhone;

    public PersonEntity(String login, String password, Integer salary, Boolean isActive, Prof prof, Instant birthday, Address address, Phone firstPhone, Phone secondPhone ) {
        this.login = login;
        this.password = password;
        this.salary = salary;
        this.isActive = isActive;
        this.prof = prof;
//        this.birthday = birthday;
        this.address = address;
        this.firstPhone = firstPhone;
        this.secondPhone = secondPhone;
    }
}
