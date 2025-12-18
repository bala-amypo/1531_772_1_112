package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.AuditTrailRecordEntity;

public interface AuditTrailService {

    AuditTrailRecordEntity createAuditTrail(AuditTrailRecordEntity auditTrailRecord);

    List<AuditTrailRecordEntity> getAllAuditTrails();
}
