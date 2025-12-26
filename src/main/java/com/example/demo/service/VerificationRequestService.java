package com.example.demo.service;

import com.example.demo.entity.VerificationRequestEntity;
import java.util.List;

public interface VerificationRequestService {

    VerificationRequestEntity createRequest(VerificationRequestEntity request);

    List<VerificationRequestEntity> getAllRequests();

    VerificationRequestEntity getRequestById(Long id);
}

