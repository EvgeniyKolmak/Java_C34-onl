package org.spring.mvc.web;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.dto.UserDto;
import org.spring.mvc.service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.spring.mvc.dto.UserDto.Type.ADMIN;

@Controller
@RequiredArgsConstructor
public class BetController {

    private final InfoService infoService;

    @GetMapping
    public String test(Model model) {

        model.addAttribute("text", "This is simple text");
//        model.addAttribute("phone", infoService.phone());
        model.addAttribute("user", new UserDto());

//        model.addAttribute("div_content", "CCCCC");
//        model.addAttribute("user_info", new UserDto("Vasya", 30));
//
//        var userDtos = List.of(
//                new UserDto("User1", 35),
//                new UserDto("User2", 40),
//                new UserDto("User3", 45),
//                new UserDto("User4", 50)
//        );
//
//        model.addAttribute("user_list", userDtos);
//
//        var mapUsers = Map.of(
//                "admin", new UserDto("Admin", 45),
//                "manager", new UserDto("Manager", 50)
//        );
//
//        model.addAttribute("map_users", mapUsers);
//
//        model.addAttribute("user_data", new UserDto("test", 30, ADMIN) );
//
//        model.addAttribute("app_type", 5);

        return "index";
    }

    @PostMapping("/info")
    public String info(@Valid @ModelAttribute(name = "user") UserDto user,
                BindingResult result,
//            @PathVariable(name = "param", required = false) String param,
//            @RequestParam(name = "param2", required = false) String param2,
            Model model) {

        if (result.hasErrors()) {
            return "index";
        }

//        model.addAttribute("param1", param);
//        model.addAttribute("param2", param2);
        return "info";
    }

}
// /saddas/asdasd/asdasdsa/asdasdas?param1=sadas&param2=sdsad&param3=sadsdad
// /tv/123
// /phone/123
// /{type}/{id}

// DELETE /tv?id={id}
// DELETE /tv/{id}