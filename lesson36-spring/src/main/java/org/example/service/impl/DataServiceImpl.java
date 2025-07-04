package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.UserEntity;
import org.example.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

    public static final String INSERT = "insert into persons (login, password, age) values (:login, :password, :age)";
    public static final String SELECT = "select * from persons where id = :id";
    public static final String DELETE = "delete from persons where login = :login and password = :password";
    public static final String UPDATE = "update persons set age = :age where id = :id";

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public DataServiceImpl(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void save(UserEntity user) {

        Map<String, Object> map = new HashMap<>();
        map.put("login", user.getLogin());
        map.put("password", user.getPassword());
        map.put("age", user.getAge());

        jdbcTemplate.update(INSERT, map);
    }

    @Override
    public UserEntity findById(Long id) {
        var list = jdbcTemplate.query(SELECT, Map.of("id", id),
                (rs, i) -> new UserEntity(
                        rs.getLong("id"),
                        rs.getString("login"),
                        rs.getString("password"),
                        rs.getInt("age"))
        );

        if (list.isEmpty()) {
            return null;
        }

        return list.getFirst();
    }
}
