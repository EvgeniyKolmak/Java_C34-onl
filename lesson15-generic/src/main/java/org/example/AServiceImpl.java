package org.example;

import java.util.List;

public class AServiceImpl implements GenericService <A, Integer> {

    @Override
    public void save(A a) {

    }

    @Override
    public A get(Integer id) {
        return null;
    }

    @Override
    public List<A> getAll() {
        return List.of();
    }
}
