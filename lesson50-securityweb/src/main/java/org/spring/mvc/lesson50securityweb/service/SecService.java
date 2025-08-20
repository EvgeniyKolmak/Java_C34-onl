package org.spring.mvc.lesson50securityweb.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class SecService {

    @Secured("ROLE_USER")
    public void test() {
        System.out.println("");
    }

}
