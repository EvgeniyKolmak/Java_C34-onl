package org.spring.mvc.lesson47tool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ToolDto {

    private UUID id;

    private String name;

    private Integer count;

}
