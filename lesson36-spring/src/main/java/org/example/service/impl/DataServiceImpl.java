package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.UserEntity;
import org.example.service.DataService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

    public static final String INSERT = "insert into persons (login, password, age) values ('%s', '%s', %s)";

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void save(UserEntity user) {

        jdbcTemplate.execute(format(INSERT, user.getLogin(), user.getPassword(), user.getAge()));

    }

}
