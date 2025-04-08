package org.example;

import java.util.List;

public interface AService {

    void save(A a);

    A get(Integer id);

    List<A> getAll();

}
