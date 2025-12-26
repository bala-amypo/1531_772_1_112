package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data @NoArgsConstructor
public class VerificationRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long credentialId;
    private String status;
}