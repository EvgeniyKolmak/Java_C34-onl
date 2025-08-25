package org.spring.mvc.lesson52jwt.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenService {

    String getToken(UserDetails user);

    void handleToken(String token);

}
