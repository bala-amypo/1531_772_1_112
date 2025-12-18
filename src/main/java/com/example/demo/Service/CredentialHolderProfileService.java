package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.CredentialHolderProfileEntity;

public interface CredentialHolderProfileService {

    CredentialHolderProfileEntity createCredentialHolder(
            CredentialHolderProfileEntity credentialHolderProfile);

    List<CredentialHolderProfileEntity> getAllCredentialHolders();
}
