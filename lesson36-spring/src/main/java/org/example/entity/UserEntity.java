package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private UUID id;
    private String login;
    private String password;
    private Integer age;

}
