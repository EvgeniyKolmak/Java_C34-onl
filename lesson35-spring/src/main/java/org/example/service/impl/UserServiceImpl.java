package org.example.service.impl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.domain.User;
import org.example.service.NotificationService;
import org.example.service.SecondService;
import org.example.service.TestService;
import org.example.service.UserService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final NotificationService notificationService;
    private final SecondService secondService;

    @Override
    public void save(User user) {
        System.out.println("user service save user");
    }

    @PostConstruct
    public void runMe() {
        System.out.println("user service runMe");
        secondService.test();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("user service destroy");
    }
}
