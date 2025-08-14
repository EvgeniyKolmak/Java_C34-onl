package org.spring.mvc.lesson47shop.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
    @Operation(summary = "Get all tools", description = "Get all tools description",
    responses = @ApiResponse(content = @Content(array = @ArraySchema(minContains = 2, maxContains = 10, schema = @Schema(implementation = ToolDto.class)))))
    public List<ToolDto> getTools() {
        return toolService.getTools();
    }

}
