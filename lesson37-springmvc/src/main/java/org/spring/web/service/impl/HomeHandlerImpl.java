package org.spring.web.service.impl;

import org.spring.web.service.HomeHandler;
import org.springframework.stereotype.Service;

@Service
public class HomeHandlerImpl implements HomeHandler {
    @Override
    public String getInfoForHomePage() {
        return "Hello HomePage";
    }
}
