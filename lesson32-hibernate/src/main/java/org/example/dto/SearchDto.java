package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Getter
public class SearchDto {

    private String login;
    private String password;
    private Integer fromVersion;
    private Integer toVersion;

}
