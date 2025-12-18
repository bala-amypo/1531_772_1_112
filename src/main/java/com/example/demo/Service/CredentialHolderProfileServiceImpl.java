package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CredentialHolderProfileEntity;
import com.example.demo.Repository.CredentialHolderProfileRepository;

@Service
public class CredentialHolderProfileServiceImpl
        implements CredentialHolderProfileService {

    @Autowired
    CredentialHolderProfileRepository credentialHolderProfileRepo;

    @Override
    public CredentialHolderProfileEntity createCredentialHolder(
            CredentialHolderProfileEntity credentialHolderProfile) {

        return credentialHolderProfileRepo.save(credentialHolderProfile);
    }

    @Override
    public List<CredentialHolderProfileEntity> getAllCredentialHolders() {

        return credentialHolderProfileRepo.findAll();
    }
}
