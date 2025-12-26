package com.example.demo.service;

import java.util.List;

import com.example.demo.Controller.VerificationRequestController;
import com.example.demo.Entity.VerificationRequestEntity;

public interface VerificationRequestService {

    VerificationRequestEntity createVerificationRequest(
            VerificationRequestController verificationRequest);

    List<VerificationRequestEntity> getAllVerificationRequests();

    VerificationRequestEntity createVerificationRequest(VerificationRequestEntity verificationRequest);
}
