package com.nutrion.nutrionbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nutrion.nutrionbackend.domain.User;
import com.nutrion.nutrionbackend.dto.LoginResquest;
import com.nutrion.nutrionbackend.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class Authcontroller {

    
  private final AuthService authService;

  public Authcontroller(AuthService authService){
    this.authService = authService;
  }

  @PostMapping("/login")
  public User login(@RequestBody LoginResquest resquest) {
      return authService.login(resquest.getEmail(), resquest.getPassword());
  }
  
}
