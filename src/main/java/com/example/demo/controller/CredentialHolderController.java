package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.CredentialHolderProfileEntity;
import com.example.demo.Service.CredentialHolderProfileService;

@RestController
public class CredentialHolderController {

    @Autowired
    private CredentialHolderProfileService credentialHolderProfileService;

    @PostMapping("/addcredentialholder")
    public CredentialHolderProfileEntity addCredentialHolder(
            @RequestBody CredentialHolderProfileEntity credentialHolderProfile) {

        return credentialHolderProfileService.createCredentialHolder(credentialHolderProfile);
    }

    @GetMapping("/showcredentialholders")
    public List<CredentialHolderProfileEntity> getAllCredentialHolders() {

        return credentialHolderProfileService.getAllCredentialHolders();
    }
}
