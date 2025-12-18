package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class VerificationRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requestType;
    private Long requestedById;
    private String requestedByName;
    private String status;
    private LocalDateTime requestedAt;

    
    public VerificationRequestEntity() {
    }

    
    public VerificationRequestEntity(Long id, String requestType, Long requestedById,
                                     String requestedByName, String status, LocalDateTime requestedAt) {
        this.id = id;
        this.requestType = requestType;
        this.requestedById = requestedById;
        this.requestedByName = requestedByName;
        this.status = status;
        this.requestedAt = requestedAt;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Long getRequestedById() {
        return requestedById;
    }

    public void setRequestedById(Long requestedById) {
        this.requestedById = requestedById;
    }

    public String getRequestedByName() {
        return requestedByName;
    }

    public void setRequestedByName(String requestedByName) {
        this.requestedByName = requestedByName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(LocalDateTime requestedAt) {
        this.requestedAt = requestedAt;
    }
}
