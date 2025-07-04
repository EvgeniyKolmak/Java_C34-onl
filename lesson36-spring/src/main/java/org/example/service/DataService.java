package org.example.service;

import org.example.entity.UserEntity;

import java.util.UUID;

public interface DataService {

    void save(UserEntity user);

    UserEntity findById(Long id);

}
