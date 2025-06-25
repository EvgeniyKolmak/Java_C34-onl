package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.config.Timer;
import org.example.domain.UserDto;
import org.example.mapper.UserMapper;
import org.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserHandlerImpl implements UserHandler {

    private final ValidationService validationService;
    private final DataService dataService;
    private final Map<String, NotificationService> notificationService;
    private final UserMapper userMapper;
    private final SecurityAccountService securityAccountService;
    private final LogoutService logoutService;

    public UserHandlerImpl(ValidationService validationService,
                           @Lazy DataService dataService,
                           Map<String, NotificationService> notificationService,
                           UserMapper userMapper,
                           @Autowired(required = false) SecurityAccountService securityAccountService,
                           LogoutService logoutService) {
        this.validationService = validationService;
        this.dataService = dataService;
        this.notificationService = notificationService;
        this.userMapper = userMapper;
        this.securityAccountService = securityAccountService;
        this.logoutService = logoutService;
    }

    @Override
    @Timer
    public void register(UserDto user) {

        var isCorrect = validationService.validate(user);

        if (!isCorrect) {
            notificationService.values()
                    .forEach(notification -> notification.sendError(user.getUsername()));
            return;
        }

        var entity = userMapper.toEntity(user);

        dataService.save(entity);

        notificationService.values()
                .forEach(notification -> notification.sendMessage(user.getUsername()));

        if (securityAccountService != null) {
            securityAccountService.createCard(user);
        }

    }

}
