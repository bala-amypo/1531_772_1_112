package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.CredentialHolderProfileEntity;

public interface CredentialHolderProfileRepository
        extends JpaRepository<CredentialHolderProfileEntity, Long> {

}
