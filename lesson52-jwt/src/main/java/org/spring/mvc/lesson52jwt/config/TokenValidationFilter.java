package org.spring.mvc.lesson52jwt.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.spring.mvc.lesson52jwt.service.TokenService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
@Slf4j
public class TokenValidationFilter extends OncePerRequestFilter {

    private final TokenService tokenService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        try {
            var token = request
                    .getHeader("Authorization");

            if (token != null && !token.isBlank()) {
                tokenService.handleToken(token);
            }

        } catch (Exception e) {
            log.warn("Token error");
        } finally {
            filterChain.doFilter(request, response);
        }

//
//        if (token == null) {
//
//        }

    }

}
