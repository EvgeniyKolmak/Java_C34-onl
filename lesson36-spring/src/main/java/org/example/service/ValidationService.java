package org.example.service;

import org.example.domain.UserDto;

public interface ValidationService {

    Boolean validate(UserDto user);

}
