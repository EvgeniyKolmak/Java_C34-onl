package org.example.service.impl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.entity.UserEntity;
import org.example.service.DataService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class DataServiceImpl implements DataService {

    @Override
    public void save(UserEntity user) {
        System.out.printf("Saving user: %s to database\n", user.getLogin());
    }

    @PostConstruct
    @Override
    public void initDbConnection() {

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("init db connection\n");
    }

    @PreDestroy
    @Override
    public void closeDbConnection() {
        System.out.println("close db connection\n");
    }
}
