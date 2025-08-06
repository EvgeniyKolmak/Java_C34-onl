package org.spring.mvc.lesson47tool.service;

import org.spring.mvc.lesson47tool.dto.OrderResult;
import org.spring.mvc.lesson47tool.dto.ToolDto;

import java.util.List;
import java.util.UUID;

public interface ToolService {

    ToolDto save(ToolDto dto);

    ToolDto findById(UUID id);

    List<ToolDto> findAll();

    OrderResult order(UUID toolId, Integer count);

}
