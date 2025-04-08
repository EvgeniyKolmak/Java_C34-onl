package org.example;

import java.util.List;

public interface GenericService <T, E> {

    void save(T t);

    T get(E id);

    List<T> getAll();

}
