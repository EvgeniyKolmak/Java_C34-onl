package org.spring.web.service.impl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.spring.web.dto.RequestData;
import org.spring.web.service.HomeHandler;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeHandlerImpl implements HomeHandler {

    private final RequestData requestData;

    @Override
    public void process() {

        System.out.println("Handler: " + requestData.getUsername());
    }
}
