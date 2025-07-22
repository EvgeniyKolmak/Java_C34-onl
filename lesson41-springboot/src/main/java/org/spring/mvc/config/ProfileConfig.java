package org.spring.mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Profile("!test")
@Configuration
public class ProfileConfig {

    @Autowired
    private Environment environment;

    @Bean
    public String test1() {
        var activeProfiles = environment.getActiveProfiles();
        return "test1";
    }

}
