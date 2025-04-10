package org.example.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String name;
    private Integer age;
    private boolean isMan;
    private List<Child> childList;

}
