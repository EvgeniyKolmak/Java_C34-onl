package org.spring.mvc.lesson50securityweb;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Lesson50SecuritywebApplication {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(Lesson50SecuritywebApplication.class, args);
    }

    @PostConstruct
    public void test() {
        var qwerty = passwordEncoder.encode("qwerty");
        System.out.printf("");
    }

}
