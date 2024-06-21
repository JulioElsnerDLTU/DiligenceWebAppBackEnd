package com.deltatech.diligencetech.platform.profiles.infrastructure.persistence.jpa.repositories;

import com.deltatech.diligencetech.platform.profiles.domain.model.aggregates.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface AgentRepository extends JpaRepository<Agent, Long> {
  Optional<Agent> findByEmail(String email);
  Optional<Agent> findByCode(String code);
  boolean existsByEmail(String email);
}
