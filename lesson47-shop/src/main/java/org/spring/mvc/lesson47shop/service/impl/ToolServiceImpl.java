package org.spring.mvc.lesson47shop.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.dto.ToolDto;
import org.spring.mvc.lesson47shop.service.ToolService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ToolServiceImpl implements ToolService {

    private final RestTemplate restTemplate;

    @Override
    public List<ToolDto> getTools() {
        var result = restTemplate.getForObject("http://127.0.0.1:8082/tool", ToolDto[].class);
        return Arrays.stream(result).collect(Collectors.toList());
    }
}
