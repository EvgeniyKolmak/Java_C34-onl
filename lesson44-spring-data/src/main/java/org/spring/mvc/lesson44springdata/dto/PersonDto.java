package org.spring.mvc.lesson44springdata.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class PersonDto {

    private UUID id;
    private String login;
    private String password;
    private Integer age;

    private String city;
    private String street;

}
