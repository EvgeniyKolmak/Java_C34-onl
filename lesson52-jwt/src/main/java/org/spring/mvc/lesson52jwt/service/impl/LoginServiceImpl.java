package org.spring.mvc.lesson52jwt.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson52jwt.dto.LoginDto;
import org.spring.mvc.lesson52jwt.service.LoginService;
import org.spring.mvc.lesson52jwt.service.TokenService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final TokenService  tokenService;
    private final InMemoryUserDetailsManager manager;
    private final PasswordEncoder encoder;

    @Override
    public String login(LoginDto dto) {
        var userDetails = manager.loadUserByUsername(dto.getUsername());
        var password = userDetails.getPassword();

        var matches = encoder.matches(dto.getPassword(), password);

        if (matches) {
            return tokenService.getToken(userDetails);
        }

        return "fail";

    }
}
