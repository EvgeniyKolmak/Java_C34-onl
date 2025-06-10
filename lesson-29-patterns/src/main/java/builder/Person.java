package builder;

import lombok.*;

@Getter @Setter
//@AllArgsConstructor
@ToString
@Builder(setterPrefix = "with")
public class Person {

    private String name;
    private int age;
    private String address;
    private String phone;

    public Person(String name, int age, String address, String phone) {

        if (name == null) {
            throw new IllegalArgumentException("Name can't be null");
        }

        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
}
