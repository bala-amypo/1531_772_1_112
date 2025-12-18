package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Entity.VerificationRuleEntity;

public interface VerificationRuleRepository 
        extends JpaRepository<VerificationRuleEntity, Long> {

    VerificationRuleEntity save(VerificationRuleEntity verificationRuleEntity);

    List<VerificationRuleEntity> findAll();

}
