package org.example.config;

import org.example.service.A;
import org.example.service.AImpl;
import org.example.service.B;
import org.example.service.BImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public A getA() {
        return new AImpl();
    }

    @Bean
    public B getB() {
        return new BImpl(getA());
    }

}
