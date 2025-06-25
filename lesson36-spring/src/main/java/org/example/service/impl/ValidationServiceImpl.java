package org.example.service.impl;

import org.example.config.Timer;
import org.example.domain.UserDto;
import org.example.service.ValidationService;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {
    @Override
    @Timer
    public Boolean validate(UserDto user) {
        return user.getAge() >= 18;
    }
}
