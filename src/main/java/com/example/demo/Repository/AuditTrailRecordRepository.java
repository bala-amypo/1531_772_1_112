package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.AuditTrailRecordEntity;


public interface AuditTrailRecordRepository extends JpaRepository<AuditTrailRecordEntity, Long> {

}
