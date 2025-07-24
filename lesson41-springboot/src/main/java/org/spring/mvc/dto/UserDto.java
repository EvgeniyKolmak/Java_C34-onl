package org.spring.mvc.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private UUID id = UUID.randomUUID();
    @NotNull @NotBlank @Length(min = 3, message = "correct name")
    private String name;
    @Min(18)
    private Integer age;
    private Type type;

    public enum Type {
        ADMIN, USER
    }

    public UserDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
