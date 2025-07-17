package org.spring.mvc.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
@Getter @Setter
public class AppConfig {

    private Bet bet;
    private String username;

    @Getter @Setter
    public static class Bet {
        private Integer min;
        private Integer max;
    }

}
