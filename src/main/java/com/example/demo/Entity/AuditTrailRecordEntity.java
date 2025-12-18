package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;
import jakarta.persistence.Id;
import org.springframework.stereotype.Indexed;

@Entity
@GeneratedValue(strategy = GenerationType.IDENTITY)
public class AuditTrailRecordEntity {

    @Id
    private Long id;
    
    private String actionType;
    private String entityName;
    private Long entityId;
    private String changedBy;
    private LocalDateTime timestamp;

    // Constructors
    public AuditTrailRecordEntity() {
    }

    public AuditTrailRecordEntity(Long id, String actionType, String entityName, Long entityId, String changedBy, LocalDateTime timestamp) {
        this.id = id;
        this.actionType = actionType;
        this.entityName = entityName;
        this.entityId = entityId;
        this.changedBy = changedBy;
        this.timestamp = timestamp;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public AuditTrailRecordEntity() {
    } 
    
}
