package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.VerificationRuleEntity;

public interface VerificationRuleRepository 
        extends JpaRepository<VerificationRuleEntity, Long> {

    VerificationRuleEntity save(VerificationRuleEntity verificationRuleEntity);

    List<VerificationRuleEntity> findAll();

}
