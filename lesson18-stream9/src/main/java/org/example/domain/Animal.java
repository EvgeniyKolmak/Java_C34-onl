package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter @Setter
//@NoArgsConstructor @AllArgsConstructor
public class Animal {

    private Optional<String> name;

    public Animal(String name) {
        this.name = Optional.ofNullable(name);
    }

    public Animal() {
        name = Optional.empty();
    }
}
