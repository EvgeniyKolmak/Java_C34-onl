package org.spring.mvc.lesson44springdata.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class SearchDto {

    private String login;
    private String password;

    private Integer from;
    private Integer to;

}
