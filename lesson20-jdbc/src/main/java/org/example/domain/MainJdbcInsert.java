package org.example.domain;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;

public class MainJdbcInsert {

    public static void main(String[] args) throws SQLException {

        Person person = new Person();
        person.setName("andrey1");
        person.setPassword("qwerty");
        person.setSex(Sex.MAN);
        person.setSalary(3000);
        person.setBirthday(LocalDate.of(2000, 02, 01));

        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/c32sql", "postgres", "postgres")) {

            PreparedStatement preparedStatement = connection.prepareStatement("insert into persons (name, password, salary, is_man, birthday) values (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getPassword());
            preparedStatement.setInt(3, person.getSalary());
            preparedStatement.setBoolean(4, person.getSex() == Sex.MAN);
            preparedStatement.setDate(5, Date.valueOf(person.getBirthday().toString()));

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
