package org.example;

import java.util.List;

public interface BService {

    void save(B b);

    B get(Integer id);

    List<B> getAll();

}
