package com.deltatech.diligencetech.platform.shared.domain.model.commands;

public record CreateAgentCommand(String agentId, String username, String password, String email) {
  public CreateAgentCommand{}
}