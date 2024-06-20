package com.deltatech.diligencetech.platform.duediligencefilemanagement.application.internal.queryservices;

import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.aggregates.Agent;
import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.queries.GetAgentByCodeQuery;
import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.queries.GetAgentByIdQuery;
import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.queries.GetAllAgentsQuery;
import com.deltatech.diligencetech.platform.duediligencefilemanagement.domain.model.aggregates.Area;
import com.deltatech.diligencetech.platform.duediligencefilemanagement.domain.model.queries.GetAllAreasQuery;
import com.deltatech.diligencetech.platform.duediligencefilemanagement.domain.model.queries.GetAreaByIdQuery;
import com.deltatech.diligencetech.platform.duediligencefilemanagement.domain.model.queries.GetAreasByProjectIdQuery;
import com.deltatech.diligencetech.platform.duediligencefilemanagement.domain.services.AreaQueryService;
import com.deltatech.diligencetech.platform.duediligencefilemanagement.infrastructure.persistence.jpa.repositories.AreaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaQueryServiceImpl implements AreaQueryService {

    private final AreaQueryService areaQueryService;
    private final AreaRepository areaRepository;

    public AreaQueryServiceImpl(AreaQueryService areaQueryService, AreaRepository areaRepository) {
        this.areaQueryService = areaQueryService;
        this.areaRepository = areaRepository;
    }

    @Override
    public Optional<Area> handle(GetAreasByProjectIdQuery query) {
        return areaRepository.findById(query.projectId());
    }

    @Override
    public Optional<Area> handle(GetAreaByIdQuery query) {
        return areaRepository.findByCode(query.areaId());
    }

    @Override
    public List<Area> handle(GetAllAreasQuery query) {
        return areaRepository.findAll();
    }




}