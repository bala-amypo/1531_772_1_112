package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.CredentialRecordEntity;

public interface CredentialRecordService {

    CredentialRecordEntity createCredentialRecord(
            CredentialRecordEntity credentialRecord);

    List<CredentialRecordEntity> getAllCredentialRecords();
}
