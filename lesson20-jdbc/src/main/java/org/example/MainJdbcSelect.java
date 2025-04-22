package org.example;

import org.example.domain.Person;
import org.example.domain.Sex;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainJdbcSelect {

    public static void main(String[] args) throws SQLException {

        List<Person> persons = new ArrayList<>();

        DriverManager.registerDriver(new org.postgresql.Driver());

        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/c32sql", "postgres", "postgres")) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from persons");

            while (resultSet.next()) {

                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setPassword(resultSet.getString("password"));
                person.setSalary(resultSet.getInt("salary"));
                person.setSex(resultSet.getBoolean("is_man") ? Sex.MAN : Sex.WOMAN);
                person.setBirthday(resultSet.getDate("birthday").toLocalDate());

                persons.add(person);

            }


        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }

        System.out.println(persons);

    }

}
