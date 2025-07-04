package org.spring.web.service.impl;

import org.spring.web.service.InfoHandler;
import org.springframework.stereotype.Service;

@Service
public class InfoHandlerImpl implements InfoHandler {
    @Override
    public String getPhoneInformation() {
        return "+375000000000";
    }
}
