package com.nutrion.nutrionbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutrion.nutrionbackend.domain.User;
import com.nutrion.nutrionbackend.dto.LoginRequest;
import com.nutrion.nutrionbackend.dto.LoginResponse;
import com.nutrion.nutrionbackend.service.AuthService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

    
  private final AuthService authService;

  public AuthController(AuthService authService){
    this.authService = authService;
  }

@PostMapping("/login")
public LoginResponse login(@RequestBody LoginRequest request) {
    User user = authService.login(request.getEmail(), request.getPassword());
    return new LoginResponse(user.getId(), user.getEmail(), user.getRole());
}

  
}
