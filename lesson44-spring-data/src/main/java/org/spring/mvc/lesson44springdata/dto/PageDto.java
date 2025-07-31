package org.spring.mvc.lesson44springdata.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor@Getter @Setter
public class PageDto {

    private Integer page;
    private Integer size;

}
