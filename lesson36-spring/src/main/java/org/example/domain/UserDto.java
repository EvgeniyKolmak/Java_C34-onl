package org.example.domain;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String username;
    private String password;
    private Integer age;

}
