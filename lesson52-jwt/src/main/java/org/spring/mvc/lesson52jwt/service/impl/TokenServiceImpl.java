package org.spring.mvc.lesson52jwt.service.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson52jwt.service.TokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {

    @Value("${app.secret}")
    private String secret;

    private SecretKey secretKey;

    @PostConstruct
    public void init() {
        secretKey = Keys.hmacShaKeyFor(secret.getBytes());
    }

    @Override
    public String getToken(UserDetails user) {

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();

        List<String> auth = new ArrayList<>();
        List<String> roles = new ArrayList<>();

        for (GrantedAuthority grantedAuthority : authorities) {

            var authority = grantedAuthority.getAuthority();

            if (authority.startsWith("ROLE_")) {
                roles.add(authority);
            } else {
                auth.add(authority);
            }

        }

        var token = Jwts.builder()
                .subject(user.getUsername())
                .claim("now", Instant.now().getEpochSecond())
                .claim("roles", roles)
                .claim("perm", auth)
                .signWith(secretKey)
                .compact();

        return token;
    }

    @Override
    public void handleToken(String rowtoken) {

        var token = rowtoken.substring(rowtoken.indexOf(" ") + 1);

        try {
            var payload = Jwts.parser()
                    .verifyWith(secretKey)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();

            var username = payload.get("sub", String.class);
            var perm = (ArrayList<String>)payload.get("perm");

            var list = perm.stream()
                    .map(SimpleGrantedAuthority::new)
                    .toList();

            Authentication authentication = new UsernamePasswordAuthenticationToken(username, null, list);

            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception exc) {
            return;
        }

    }
}
