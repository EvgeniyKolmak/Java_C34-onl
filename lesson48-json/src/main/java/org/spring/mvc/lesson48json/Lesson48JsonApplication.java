package org.spring.mvc.lesson48json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.spring.mvc.lesson48json.dto.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson48JsonApplication {

    @SneakyThrows
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

//        User user = new User("user", "user@email.com", "qwerty", 20, true);


        var userJson = """
                    {
                      "name":"user",
                      "email":"user@email.com",
                      "password":"qwerty",
                      "age":20,
                      "enabled":true,
                      "role": "USER"
                    }
                """;

        var user = mapper.readValue(userJson, User.class);


//        var json = mapper.writeValueAsString(user);

        System.out.printf("");


        SpringApplication.run(Lesson48JsonApplication.class, args);
    }

}
