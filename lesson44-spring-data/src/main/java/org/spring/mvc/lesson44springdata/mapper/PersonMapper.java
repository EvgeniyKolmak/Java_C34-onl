package org.spring.mvc.lesson44springdata.mapper;

import org.mapstruct.Mapper;
import org.spring.mvc.lesson44springdata.domain.PersonEntity;
import org.spring.mvc.lesson44springdata.dto.PersonDto;
import org.spring.mvc.lesson44springdata.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonEntity toEntity(PersonDto dto);

    PersonDto toDto(PersonEntity entity);

    List<PersonDto> toDto(List<PersonEntity> entities);

    default List<PersonDto> fromView(List<PersonRepository.PersonSimpleView> views) {
        return views.stream()
                .map(item -> new PersonDto(item.getLogin(), item.getAge()))
                .toList();
    }

}
