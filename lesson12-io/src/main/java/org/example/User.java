package org.example;

import java.io.Serializable;

public class User implements AutoCloseable, Serializable {

    public static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private transient Adress address;

    @Override
    public void close() {
        System.out.println("Close User");
    }

    public User(String name, Integer age, Adress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
