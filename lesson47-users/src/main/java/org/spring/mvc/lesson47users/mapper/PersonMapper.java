package org.spring.mvc.lesson47users.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.spring.mvc.lesson47users.domain.PersonEntity;
import org.spring.mvc.lesson47users.dto.PersonDto;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto toDto(PersonEntity person);

    @Mapping(target = "blocked", constant = "false")
    PersonEntity toEntity(PersonDto dto);

}
