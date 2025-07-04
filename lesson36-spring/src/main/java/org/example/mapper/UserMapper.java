package org.example.mapper;

import org.example.domain.UserDto;
import org.example.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(imports = UUID.class, componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "age", source = "user.age")
    @Mapping(target = "login", source = "user.username")
    @Mapping(target = "password", source = "user.password")
    @Mapping(target = "id", ignore = true)
    UserEntity toEntity(UserDto user);

}
