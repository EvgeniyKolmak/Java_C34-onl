package org.example.domain;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Student {

    private String username;
    private int course;
    private Integer mark;
    private List<Lesson> lessons;

}
