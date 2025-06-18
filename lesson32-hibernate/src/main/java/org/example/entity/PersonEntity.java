package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<PhoneEntity> phones;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "pers_cars_join", joinColumns = @JoinColumn(name = "pers_id"), inverseJoinColumns = @JoinColumn(name = "cars_id"))
    private List<CarEntity> cars = new ArrayList<>();

    @Version
    private Long version;

    public PersonEntity(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void addPhone(PhoneEntity phone) {
        if (phones == null) {
            phones = new ArrayList<>();
        }

        phones.add(phone);
        phone.setPerson(this);
    }

    public void addCar(CarEntity car) {
        cars.add(car);
        car.getPersons().add(this);
    }

//    @PrePersist
//    public void doBeforePersist() {
//        System.out.println("doBeforePersist");
//    }
//
//    @PostPersist
//    public void doAfterPersist() {
//        System.out.println("doAfterPersist");
//    }

}
