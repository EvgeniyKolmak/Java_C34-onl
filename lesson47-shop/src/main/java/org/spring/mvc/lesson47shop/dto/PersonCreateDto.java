package org.spring.mvc.lesson47shop.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class PersonCreateDto {

    @Schema(example = "pasyasuperstar", description = "person username description", requiredMode = Schema.RequiredMode.REQUIRED)
    private String login;
    @Min(20) @Max(100)
    private Integer age;
    @Schema(pattern = "[0-9]*")
    private String token;

}
