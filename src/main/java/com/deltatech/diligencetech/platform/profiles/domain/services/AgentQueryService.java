package com.deltatech.diligencetech.platform.profiles.domain.services;

import com.deltatech.diligencetech.platform.profiles.domain.model.aggregates.Agent;
import com.deltatech.diligencetech.platform.profiles.domain.model.queries.GetAgentByCodeQuery;
import com.deltatech.diligencetech.platform.profiles.domain.model.queries.GetAgentByEmailQuery;
import com.deltatech.diligencetech.platform.profiles.domain.model.queries.GetAgentByIdQuery;
import com.deltatech.diligencetech.platform.profiles.domain.model.queries.GetAllAgentsQuery;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface AgentQueryService {
  Optional<Agent> handle(GetAgentByIdQuery query);
  Optional<Agent> handle(GetAgentByEmailQuery query);
  List<Agent> handle (GetAllAgentsQuery query);
  Optional<Agent> handle(GetAgentByCodeQuery query);
}

