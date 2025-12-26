package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @Gener
        @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;}@Table(name = "users")public class UserEntity {   atedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

