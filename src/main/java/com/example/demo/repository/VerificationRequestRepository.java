package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.VerificationRequestEntity;

public interface VerificationRequestRepository
        extends JpaRepository<VerificationRequestEntity, Long> {

}
