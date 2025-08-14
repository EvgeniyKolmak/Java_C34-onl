package org.spring.mvc.lesson47shop.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PersonDto extends RepresentationModel<PersonDto> {

    @Schema(description = "uuid generated primary key")
    private UUID id;
    private String login;
    private Integer age;

}
