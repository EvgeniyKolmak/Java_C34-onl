package org.spring.mvc.lesson44springdata.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Transactional(value = Transactional.TxType.REQUIRED)
    public void runMe() {

    }

}
