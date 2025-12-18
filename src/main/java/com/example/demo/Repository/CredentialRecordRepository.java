package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.CredentialRecordEntity;

public interface CredentialRecordRepository
        extends JpaRepository<CredentialRecordEntity, Long> {

}
