package org.spring.web.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class ProfileDto {

    private String login;
    private String password;
    private Integer age;

}
