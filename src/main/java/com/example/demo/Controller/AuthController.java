package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.AuthCOn;
import com.example.demo.Service.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/addauth")
    public AuthEntity addAuth(
            @RequestBody AuthEntity authEntity) {

        return authService.createAuth(authEntity);
    }

    @GetMapping("/showauth")
    public List<AuthEntity> getAllAuths() {

        return authService.getAllAuths();
    }
}
