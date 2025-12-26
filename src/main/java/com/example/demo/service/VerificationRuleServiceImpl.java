package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.VerificationRuleEntity;
import com.example.demo.Repository.VerificationRuleRepository;

@Service
public class VerificationRuleServiceImpl implements VerificationRuleService {

    @Autowired
    VerificationRuleRepository verificationRuleRepo;

    @Override
    public VerificationRuleEntity createVerificationRule(
            VerificationRuleEntity verificationRuleEntity) {

        return verificationRuleRepo.save(verificationRuleEntity);
    }

    @Override
    public List<VerificationRuleEntity> getAllVerificationRules() {

        return verificationRuleRepo.findAll();
    }
}
