package com.example.demo.service;

import java.util.List;
import com.example.demo.Entity.VerificationRuleEntity;

public interface VerificationRuleService {

    VerificationRuleEntity createVerificationRule(VerificationRuleEntity verificationRuleEntity);

    List<VerificationRuleEntity> getAllVerificationRules();
}
