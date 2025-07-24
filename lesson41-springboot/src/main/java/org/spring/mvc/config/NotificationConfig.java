package org.spring.mvc.config;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.service.NotificationService;
import org.spring.mvc.service.impl.NotificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@ConditionalOnBooleanProperty(name = "app.notification.enabled")
@Configuration
@RequiredArgsConstructor
public class NotificationConfig {

    @Bean
    public NotificationService notificationService() {
        return new NotificationServiceImpl();
    }

}
