package org.spring.mvc.lesson44springdata.mapper;

import org.mapstruct.Mapper;
import org.spring.mvc.lesson44springdata.domain.AddresEntity;
import org.spring.mvc.lesson44springdata.dto.PersonDto;

@Mapper(componentModel = "spring")
public interface AddresMapper {

    AddresEntity toEntity(PersonDto dto);

}
