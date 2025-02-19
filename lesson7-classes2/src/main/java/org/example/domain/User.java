package org.example.domain;

public class User {

    private String username = "default";
    private String password;
    private String[] hobby;

    public User() {
        this("default");
        System.out.println("Empty");
    }

    public User(String username) {
        this(username, "default");
        System.out.println("Username");
    }

    public User(String username, String password, String[] hobby) {
        this.username = username;
        this.password = password;
        this.hobby = hobby;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("All");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
