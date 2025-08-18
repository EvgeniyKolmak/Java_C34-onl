package org.spring.mvc.lesson50securityweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persons")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class PersonEntity implements UserDetails {

    @Id
    @UuidGenerator
    private UUID id;

    private String username;

    private String password;

    private String authority;

    @Column(name = "is_enabled")
    private boolean isEnabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (authority == null || authority.isBlank()) {
            return List.of();
        }

        return Arrays.stream(authority.split(","))
                .map(SimpleGrantedAuthority::new)
                .toList();
    }

    // auth -> read,write, user,admin
    // role -> ROLE_USER, ROLE_ADMIN, ROLE_READ

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
