package org.spring.mvc.lesson47tool.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47tool.dto.OrderDto;
import org.spring.mvc.lesson47tool.dto.OrderResult;
import org.spring.mvc.lesson47tool.dto.ToolDto;
import org.spring.mvc.lesson47tool.service.ToolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tool")
public class ToolController {

    private final ToolService service;

    @PostMapping
    public ToolDto save(@RequestBody ToolDto toolDto) {
        return service.save(toolDto);
    }

    @GetMapping("/{id}")
    public ToolDto find(@PathVariable(name = "id") UUID id) {
        return service.findById(id);
    }

    @GetMapping
    public List<ToolDto> findAll() {
        return service.findAll();
    }

    @PutMapping("/{id}")
    public OrderResult order(@PathVariable(name = "id") UUID id, @RequestBody OrderDto orderDto) {
        return service.order(id, orderDto.getCount());
    }

}
