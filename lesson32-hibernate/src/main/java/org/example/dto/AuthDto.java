package org.example.dto;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString
public class AuthDto {

    private String login;

    private String password;

}
