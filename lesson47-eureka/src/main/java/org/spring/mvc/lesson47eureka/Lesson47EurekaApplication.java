package org.spring.mvc.lesson47eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lesson47EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson47EurekaApplication.class, args);
    }

}
