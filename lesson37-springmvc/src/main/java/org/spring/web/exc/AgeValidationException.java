package org.spring.web.exc;

import lombok.Getter;
import org.spring.web.dto.ProfileDto;

@Getter
public class AgeValidationException extends RuntimeException {

    private ProfileDto profile;

    public AgeValidationException(ProfileDto profile) {
        this.profile = profile;
    }
}
