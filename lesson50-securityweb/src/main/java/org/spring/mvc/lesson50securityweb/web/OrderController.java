package org.spring.mvc.lesson50securityweb.web;

import lombok.extern.slf4j.Slf4j;
import org.spring.mvc.lesson50securityweb.model.PersonEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @GetMapping
    public String create() {

        var authentication = SecurityContextHolder.getContext().getAuthentication();

        var principal = authentication.getPrincipal();

        if (principal instanceof PersonEntity pe) {
            var id = pe.getId();

            log.info("UserId: {}", id);
        }

        return "order";
    }

}

/*

toolId
count


 */