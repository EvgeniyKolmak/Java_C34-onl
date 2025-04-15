package org.example.domain;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor @ToString
public class Galaxy {

    public String name;

    private Systemz systemz;

}
