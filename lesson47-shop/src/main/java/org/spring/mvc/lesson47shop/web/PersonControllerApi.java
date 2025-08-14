package org.spring.mvc.lesson47shop.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.spring.mvc.lesson47shop.dto.ErrorDetailDto;
import org.spring.mvc.lesson47shop.dto.PersonCreateDto;
import org.spring.mvc.lesson47shop.dto.PersonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface PersonControllerApi {


    @PostMapping
    @Operation(summary = "Create person summery", description = "create person description", tags = {"write", "create"},
            responses = {
                    @ApiResponse(description = "person created", responseCode = "201", content = @Content(schema = @Schema(implementation = PersonDto.class))),
                    @ApiResponse(description = "username already registered", responseCode = "400", headers = @Header(name = "apiVersion"), content = @Content(schema = @Schema(implementation = ErrorDetailDto.class))),
                    @ApiResponse(description = "unknown error", responseCode = "500", content = @Content())
            })
    PersonDto create(@RequestBody PersonCreateDto personDto);

    @GetMapping
    @Operation(summary = "GET person summery", description = "GET person description", tags = {"read", "create"}, deprecated = true)
    PersonDto findByLogin(@RequestParam("login") String login);
}
