package org.spring.mvc.lesson47tool.mapper;

import org.mapstruct.Mapper;
import org.spring.mvc.lesson47tool.domain.ToolEntity;
import org.spring.mvc.lesson47tool.dto.ToolDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ToolMapper {

    ToolDto toDto(ToolEntity person);

    ToolEntity toEntity(ToolDto dto);

    List<ToolDto> toDtos(List<ToolEntity> persons);

}
