package org.spring.mvc.lesson52jwt.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class LoginDto {

    private String username;
    private String password;

}
