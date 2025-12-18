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

    @PostMapping("/addverificationrequest")
    public VerificationRequestEntity addVerificationRequest(
            @RequestBody VerificationRequestController verificationRequest) {

        return verificationRequestService.createVerificationRequest(verificationRequest);
    }

    @GetMapping("/showverificationrequests")
    public List<VerificationRequestEntity> getAllVerificationRequests() {

        return verificationRequestService.getAllVerificationRequests();
    }
}
