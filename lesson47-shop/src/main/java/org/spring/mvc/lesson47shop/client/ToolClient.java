package org.spring.mvc.lesson47shop.client;

import org.spring.mvc.lesson47shop.dto.OrderCountDto;
import org.spring.mvc.lesson47shop.dto.OrderDto;
import org.spring.mvc.lesson47shop.dto.ToolDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "tool-client", url = "http://127.0.0.1:8082", path = "/tool")
public interface ToolClient {

    @GetMapping
    List<ToolDto> findAll();

    @PutMapping("/{id}")
    void book(@PathVariable(name = "id") UUID id, @RequestBody OrderCountDto countDto);

}
