package org.spring.mvc.lesson47shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.spring.mvc.lesson47shop.client")
public class Lesson47ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson47ShopApplication.class, args);
    }

}
