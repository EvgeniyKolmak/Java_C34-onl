package org.example.user.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.user.domain.FieldErrorDetails;
import org.example.user.domain.User;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class UserValidationException extends RuntimeException{

    private User user;
    private FieldErrorDetails[] details;

    public void addDetail(String field, String message) {

        if (details == null) {
            details = new FieldErrorDetails[1];
            details[0] = new FieldErrorDetails(field, message);
            return;
        }

        details = Arrays.copyOf(details, details.length + 1);
        details[details.length - 1] = new FieldErrorDetails(field, message);

    }

}
