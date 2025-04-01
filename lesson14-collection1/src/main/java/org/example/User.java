package org.example;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString
public class User implements Comparable<User> {

    private String login;

    private String password;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(login);
    }

    @Override
    public int compareTo(User o) {
        return o.getLogin().length() - login.length();
    }
}
// hashcode
// у двух один обьектов -> hashcode одинаковый
// у двух разных обьектов -> нет требования но лучше разные

// equal
// a.equals(b) = b.equals(a)
// a.equals(a) = true
// a.equals(b) && b.equals(c) -> a.equals(c)
