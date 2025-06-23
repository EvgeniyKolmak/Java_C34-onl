package org.example.service.impl;

import org.example.domain.UserDto;
import org.example.service.SecurityAccountService;
import org.springframework.stereotype.Service;

@Service
public class SecurityAccountServiceImpl implements SecurityAccountService {
    @Override
    public void createCard(UserDto user) {
        System.out.printf("Creating a new card for %s\n", user.getUsername());
    }
}
