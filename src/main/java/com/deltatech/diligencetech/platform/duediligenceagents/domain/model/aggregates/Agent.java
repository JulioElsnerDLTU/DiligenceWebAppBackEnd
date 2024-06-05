package com.deltatech.diligencetech.platform.duediligenceagents.domain.model.aggregates;

import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.valueobjects.AgentData;
import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.valueobjects.AgentRole;
import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.valueobjects.Image;
import com.deltatech.diligencetech.platform.duediligenceagents.domain.model.valueobjects.ProfileId;
import com.deltatech.diligencetech.platform.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.domain.AbstractAggregateRoot;

@Getter
@Entity
public class Agent extends AbstractAggregateRoot<Agent> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
    private Long id;

  @Embedded
  @Getter
  private AgentRole agentRole;

  @Embedded
  @Getter
  private Image image;

  @Embedded
  @Getter
  private AgentData agentData;

  public Agent() {
   /* this.profileId = new ProfileId();*/
    this.agentRole = new AgentRole();
    this.image = new Image();
    }


}