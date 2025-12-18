package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.VerificationRuleEntity;
import com.example.demo.Service.VerificationRuleService;

@RestController
public class VerificationRuleController {

    @Autowired
    private VerificationRuleService verificationRuleService;

    // Add a new verification rule
    @PostMapping("/addverificationrule")
    public VerificationRuleEntity addVerificationRule(
            @RequestBody VerificationRuleEntity verificationRuleEntity) {

        return verificationRuleService.createVerificationRule(verificationRuleEntity);
    }

    // Get all verification rules
    @GetMapping("/showverificationrules")
    public List<VerificationRuleEntity> getAllVerificationRules() {

        return verificationRuleService.getAllVerificationRules();
    }
}
