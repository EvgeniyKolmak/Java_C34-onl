package org.spring.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.spring.web.dto.ProfileDto;
import org.spring.web.service.HomeHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    private final HomeHandler homeHandler;

    @GetMapping("/profile")
    public String homeProfilePage() {
        var infoForHomePage = homeHandler.getInfoForHomePage();
        return "home";
    }

    @PostMapping("/profile")
    public String homeProfilePagePost(
            ProfileDto profile,
@RequestHeader(name = "xzczxc", required = false) String headerValue, @CookieValue(name = "asdasd", required = false) String cookieValue
//            ProfileDto profile
    ) {

        System.out.println(profile);
        return "home";
    }

    @GetMapping("/shop")
    public String homeShopPage() {
        var infoForHomePage = homeHandler.getInfoForHomePage();
        return "shop";
    }

}
/*

/home/profile
/home/shop

 */