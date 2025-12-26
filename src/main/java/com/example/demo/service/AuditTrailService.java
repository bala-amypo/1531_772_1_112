package com.example.demo.service;

import java.util.List;
import com.example.demo.Entity.AuditTrailRecordEntity;

public interface AuditTrailService {

    AuditTrailRecordEntity createAuditTrail(AuditTrailRecordEntity auditTrailRecord);

    List<AuditTrailRecordEntity> getAllAuditTrails();
}
