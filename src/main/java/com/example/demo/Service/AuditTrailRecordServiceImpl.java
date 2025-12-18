 package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.AuditTrailRecordEntity;
import com.example.demo.Repository.AuditTrailRecordRepository;

@Service
public class AuditTrailServiceImpl implements AuditTrailService {

    @Autowired
    AuditTrailRecordRepository auditTrailRepo;

    @Override
    public AuditTrailRecordEntity createAuditTrail(AuditTrailRecordEntity auditTrailRecord) {
        return auditTrailRepo.save(auditTrailRecord);
    }

    @Override
    public List<AuditTrailRecordEntity> getAllAuditTrails() {
        return auditTrailRepo.findAll();
    }
}
