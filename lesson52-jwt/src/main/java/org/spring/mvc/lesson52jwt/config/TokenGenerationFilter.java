package org.spring.mvc.lesson52jwt.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson52jwt.dto.LoginDto;
import org.spring.mvc.lesson52jwt.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class TokenGenerationFilter extends OncePerRequestFilter {

    private final ApplicationContext context;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        var parameterMap = request.getParameterMap();

        if (parameterMap.containsKey("username") && parameterMap.containsKey("password")) {
            var bean = context.getBean(LoginService.class);

            var token = bean.login(new LoginDto(parameterMap.get("username")[0], parameterMap.get("password")[0]));

            response.setHeader("Token", token);

        }


        filterChain.doFilter(request, response);
    }
}

/*

Проект по бронированию отелей

1) Регистрация пользователей
    Роли- VIP, STANDART

  2) Просмотр всех свободных номеров
    фильтр по категоории (скидки для vip)

   3) бронирование номера
       создание карточки брони



 */
