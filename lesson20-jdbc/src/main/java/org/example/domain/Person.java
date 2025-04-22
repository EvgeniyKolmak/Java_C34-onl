package org.example.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString
public class Person {
    private Integer id;
    private String name;
    private String password;
    private Integer salary;
    private Sex sex;
    private LocalDate birthday;

    private List<String> address;

}
