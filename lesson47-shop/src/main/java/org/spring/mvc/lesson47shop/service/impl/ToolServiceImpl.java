package org.spring.mvc.lesson47shop.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47shop.client.ToolClient;
import org.spring.mvc.lesson47shop.dto.ToolDto;
import org.spring.mvc.lesson47shop.service.ToolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToolServiceImpl implements ToolService {

    private final ToolClient client;

    @Override
    public List<ToolDto> getTools() {
        return client.findAll();
    }
}
