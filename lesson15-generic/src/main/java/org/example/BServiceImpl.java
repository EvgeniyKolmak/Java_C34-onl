package org.example;

import java.util.List;

public class BServiceImpl implements GenericService <B, String> {
    @Override
    public void save(B b) {

    }

    @Override
    public B get(String id) {
        return null;
    }

    @Override
    public List<B> getAll() {
        return List.of();
    }
}
