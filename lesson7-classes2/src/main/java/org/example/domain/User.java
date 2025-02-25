package org.example.domain;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username = "default";
    private String password;
    private String[] hobby;

    public User(String username) {
        this(username, "default");
        System.out.println("Username");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("All");
    }

}
