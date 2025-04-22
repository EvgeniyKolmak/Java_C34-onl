package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/c32sql", "postgres", "postgres");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement
                .executeQuery("select * from persons");

        while (resultSet.next()) {

            String name = resultSet.getString("name");
            boolean isMan = resultSet.getBoolean("is_man");
            System.out.println(name + " " + isMan);


        }



//        statement.execute("""
//                    insert into persons (name, password, salary, is_man, birthday) VALUES
//                                                                   ('person10', 'qwerty', 1000, true, '2000-01-01')
//                    """);
//        resultSet.close();
//        statement.close();
        connection.close();

    }
}