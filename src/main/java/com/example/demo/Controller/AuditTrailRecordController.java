 package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.AuditTrailRecordEntity;
import com.example.demo.Service.AuditTrailService;

@RestController
public class AuditTrailController {

    @Autowired
    private AuditTrailService auditTrailService;

    @PostMapping("/addaudittrail")
    public AuditTrailRecordEntity addAuditTrail(
            @RequestBody AuditTrailRecordEntity auditTrailRecord) {

        return auditTrailService.createAuditTrail(auditTrailRecord);
    }

    @GetMapping("/showaudittrail")
    public List<AuditTrailRecordEntity> getAllAuditTrails() {

        return auditTrailService.getAllAuditTrails();
    }
}
