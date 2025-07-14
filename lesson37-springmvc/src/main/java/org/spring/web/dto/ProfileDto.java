package org.spring.web.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class ProfileDto {

    @NotBlank(message = "must be not black, please fill")
    private String login;
    @NotBlank(message = "must be not black, please fill")
    private String password;
    @NotNull(message = "not null age")
    @Min(value = 18, message = "too small")
    private Integer age;

}
