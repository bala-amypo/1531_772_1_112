package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.CredentialRecordEntity;
import com.example.demo.Service.CredentialRecordService;

@RestController
public class CredentialRecordController {

    @Autowired
    private CredentialRecordService credentialRecordService;

    @PostMapping("/addcredentialrecord")
    public CredentialRecordEntity addCredentialRecord(
            @RequestBody CredentialRecordEntity credentialRecord) {

        return credentialRecordService.createCredentialRecord(credentialRecord);
    }

    @GetMapping("/showcredentialrecords")
    public List<CredentialRecordEntity> getAllCredentialRecords() {
        return credentialRecordService.getAllCredentialRecords();
    }
}
