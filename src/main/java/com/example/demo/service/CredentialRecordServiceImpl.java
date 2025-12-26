package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CredentialRecordEntity;
import com.example.demo.Repository.CredentialRecordRepository;

@Service
public class CredentialRecordServiceImpl
        implements CredentialRecordService {

    @Autowired
    CredentialRecordRepository credentialRecordRepo;

    @Override
    public CredentialRecordEntity createCredentialRecord(
            CredentialRecordEntity credentialRecord) {

        return credentialRecordRepo.save(credentialRecord);
    }

    @Override
    public List<CredentialRecordEntity> getAllCredentialRecords() {

        return credentialRecordRepo.findAll();
    }
}
