package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.VerificationRequestEntity;
import com.example.demo.Service.VerificationRequestService;

@RestController
public class VerificationRequestController {

    @Autowired
    private VerificationRequestService verificationRequestService;

    // POST: Add new verification request
    @PostMapping("/addverificationrequest")
    public VerificationRequestEntity addVerificationRequest(
            @RequestBody VerificationRequestEntity verificationRequest) {

        return verificationRequestService.createVerificationRequest(verificationRequest);
    }

    // GET: Fetch all verification requests
    @GetMapping("/showverificationrequests")
    public List<VerificationRequestEntity> getAllVerificationRequests() {

        return verificationRequestService.getAllVerificationRequests();
    }
}
