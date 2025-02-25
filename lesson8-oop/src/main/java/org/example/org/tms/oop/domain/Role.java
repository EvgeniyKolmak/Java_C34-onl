package org.example.org.tms.oop.domain;

public enum Role implements DescriptionService {

    USER("simple user"),
    ADMIN("wild admin"),
    SUPPORT("lazy support"),
    UNKNOWN("????");

    private String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
