package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Controller.VerificationRequestController;
import com.example.demo.Entity.VerificationRequestEntity;
import com.example.demo.Repository.VerificationRequestRepository;

@Service
public class VerificationRequestServiceImpl
        implements VerificationRequestService {

    @Autowired
    VerificationRequestRepository verificationRequestRepo;

    @Override
    public VerificationRequestEntity createVerificationRequest(VerificationRequestEntity verificationRequest) {

        return verificationRequestRepo.save(verificationRequest);
    }

    @Override
    public List<VerificationRequestEntity> getAllVerificationRequests() {

        return verificationRequestRepo.findAll();
    }

    @Override
    public VerificationRequestEntity createVerificationRequest(VerificationRequestController verificationRequest) {
        
        throw new UnsupportedOperationException("Unimplemented method 'createVerificationRequest'");
    }
}
