package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Order implements Comparable<Order> {

    private Integer order;

    @Override
    public int compareTo(Order o) {
        return order - o.order;
    }
}
