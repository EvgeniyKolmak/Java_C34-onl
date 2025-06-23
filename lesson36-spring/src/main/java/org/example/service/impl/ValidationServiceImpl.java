package org.example.service.impl;

import org.example.domain.UserDto;
import org.example.service.ValidationService;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {
    @Override
    public boolean validate(UserDto user) {
        return user.getAge() >= 18;
    }
}
