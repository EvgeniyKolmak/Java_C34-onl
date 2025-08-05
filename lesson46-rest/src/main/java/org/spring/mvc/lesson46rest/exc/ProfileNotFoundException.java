package org.spring.mvc.lesson46rest.exc;

import lombok.Getter;

@Getter
public class ProfileNotFoundException extends RuntimeException {

    private String profile;

    public ProfileNotFoundException(String profile) {
        this.profile = profile;
    }
}
