package org.spring.mvc.lesson44springdata.mapper;

import org.mapstruct.Mapper;
import org.spring.mvc.lesson44springdata.domain.PersonEntity;
import org.spring.mvc.lesson44springdata.dto.PersonDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonEntity toEntity(PersonDto dto);

    PersonDto toDto(PersonEntity entity);

    List<PersonDto> toDto(List<PersonEntity> entities);

}
