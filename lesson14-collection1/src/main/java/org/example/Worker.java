package org.example;

import lombok.*;

import java.util.List;

@NoArgsConstructor @AllArgsConstructor
@Setter @Getter @ToString
public class Worker {

    private String name;
    private Integer age;
    private Integer salary;
    private List<Child> childList;

}
