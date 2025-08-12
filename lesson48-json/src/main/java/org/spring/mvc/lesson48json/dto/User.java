package org.spring.mvc.lesson48json.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @JsonProperty("name")
    private String login;
    private List<String> email;
    private String password;
    private Integer age;
    private boolean enabled;

}
