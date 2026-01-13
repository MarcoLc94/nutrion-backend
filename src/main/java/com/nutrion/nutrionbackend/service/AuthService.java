package com.nutrion.nutrionbackend.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nutrion.nutrionbackend.domain.User;
import com.nutrion.nutrionbackend.repository.UserRepository;

@Service
public class AuthService {
    
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User login(String email, String password){

        User user = userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("Invalid email or password"));

        if(!passwordEncoder.matches(password, user.getPassword())){
            throw new RuntimeException("Invalid password");
        }
return user;
      
    }
}
