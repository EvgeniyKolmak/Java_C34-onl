package org.example.org.tms.oop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class User {

    private String login;
    private String password;
//    private Address address;
    private Role role;
    private Sex sex;

//    public User(String login, String password, String city, String street) {
//        this.login = login;
//        this.password = password;
//        Address address = new Address(street, city);
//        this.address = address;
//    }
//
//    @Getter @Setter
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public class Address {
//        private String street;
//        private String city;
//
//        public void testIn() {
//            System.out.println(login);
//        }
//
//    }

}
