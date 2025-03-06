package org.example.user.service;

import org.example.user.domain.User;
import org.example.user.exception.TestMyChekedException;

public interface DataService {

    void save(User user) throws TestMyChekedException;

}
