package org.spring.mvc.lesson47shop.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.ToolDto;
import org.spring.mvc.lesson47shop.service.ToolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tool")
@RequiredArgsConstructor
public class ToolController {

    private final ToolService toolService;

    @GetMapping
    public List<ToolDto> getTools() {
        return toolService.getTools();
    }

}
