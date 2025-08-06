package org.spring.mvc.lesson47users.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PersonDto {

    private UUID id;

    private String login;

    private Boolean blocked;

}
