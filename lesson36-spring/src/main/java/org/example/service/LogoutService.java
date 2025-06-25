package org.example.service;

import org.example.config.Timer;
import org.example.domain.UserDto;
import org.springframework.stereotype.Service;

@Service
public class LogoutService {

    @Timer
    public void logout(UserDto user) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
