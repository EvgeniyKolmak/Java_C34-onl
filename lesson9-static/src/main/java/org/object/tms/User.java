package org.object.tms;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class User implements Cloneable {

    private String name;
    private String password;
    private int age;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(address, user.address);
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
