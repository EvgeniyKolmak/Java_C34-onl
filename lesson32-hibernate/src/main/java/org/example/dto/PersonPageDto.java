package org.example.dto;

import lombok.*;
import org.example.entity.PersonEntity;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PersonPageDto {

    private int total;
    private List<PersonEntity> persons;

}
