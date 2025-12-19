package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepo.save(user);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepo.findAll();
    }

    
    public UserEntity getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    
    public UserEntity getUserByUsername(String username) {
        return userRepo.findByUsername(username).orElse(null);
    }

    
    public UserEntity getUserByEmail(String email) {
        return userRepo.findByEmail(email).orElse(null);
    }

    
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
