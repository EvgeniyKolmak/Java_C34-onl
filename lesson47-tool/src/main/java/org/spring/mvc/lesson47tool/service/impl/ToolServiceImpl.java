package org.spring.mvc.lesson47tool.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson47tool.domain.ToolEntity;
import org.spring.mvc.lesson47tool.dto.OrderResult;
import org.spring.mvc.lesson47tool.dto.ToolDto;
import org.spring.mvc.lesson47tool.exc.ToolCommonException;
import org.spring.mvc.lesson47tool.mapper.ToolMapper;
import org.spring.mvc.lesson47tool.repository.ToolRepository;
import org.spring.mvc.lesson47tool.service.ToolService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ToolServiceImpl implements ToolService {

    @Value("${app.tool.enabled:true}")
    private boolean enabled;

    private final ToolRepository repo;
    private final ToolMapper mapper;

    @Override
    public ToolDto save(ToolDto dto) {
        var entity = mapper.toEntity(dto);

        var result = repo.save(entity);

        return mapper.toDto(result);
    }

    @Override
    public ToolDto findById(UUID id) {
        return mapper.toDto(repo.findById(id).get());
    }

    @Override
    public List<ToolDto> findAll() {

        if (!enabled) {
            throw new ToolCommonException(808201, "shop is disabled");
        }

        return mapper.toDtos(repo.findAll());
    }

    @Override
    @Transactional
    public OrderResult order(UUID toolId, Integer count) {

        var byId = repo.findById(toolId);

        if (byId.isEmpty()) {
            throw new ToolCommonException(808202, "unknown tool : " + toolId);
        }

        var tool = byId.get();

        if (tool.getCount() < count) {
            throw new ToolCommonException(808203, "not enough tools. Needed: " + count + " but found: " + tool.getCount());
        }

        tool.setCount(tool.getCount() - count);

        return new OrderResult(true);
    }

}
