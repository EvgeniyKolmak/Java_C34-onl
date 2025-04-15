package org.example.domain;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString
public class Planet {

    private String name;
    private Country country;

}
