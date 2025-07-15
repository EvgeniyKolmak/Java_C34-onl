package org.spring.web.service.impl;

import org.spring.web.dto.ProfileDto;
import org.spring.web.exc.AgeValidationException;
import org.spring.web.exc.PasswordValidationException;
import org.spring.web.exc.UnexpectedException;
import org.spring.web.service.ProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Override
    public void process(ProfileDto profileDto) {

        System.out.println("Process profile");

        if (profileDto.getAge() % 2 == 0) {
            throw new AgeValidationException(profileDto);
        }

        if (profileDto.getPassword().length() < 5) {
            throw new PasswordValidationException(profileDto.getPassword());
        }

        if (profileDto.getLogin().length() < 5) {
            throw new UnexpectedException();
        }

        System.out.println("Profile correct");
    }
}
