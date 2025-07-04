package org.example.mapper;

import org.example.entity.UserEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class UserRowMapper implements RowMapper<UserEntity> {

    @Override
    public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        var id = rs.getLong("id");
        var login =  rs.getString("login");
        var password = rs.getString("password");
        var age = rs.getInt("age");
        return new UserEntity(id, login, password, age);
    }

}
