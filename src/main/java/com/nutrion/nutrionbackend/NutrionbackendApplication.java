package com.nutrion.nutrionbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nutrion.nutrionbackend.domain.QrCode;
import com.nutrion.nutrionbackend.domain.User;
import com.nutrion.nutrionbackend.repository.QrRepository;
import com.nutrion.nutrionbackend.repository.UserRepository;




@SpringBootApplication
public class NutrionbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutrionbackendApplication.class, args);
	}

@Bean
CommandLineRunner initData(
    UserRepository userRepository,
    QrRepository qrRepository,
    PasswordEncoder passwordEncoder
){
    return args -> {
        User user = new User();
        user.setEmail("admin@nutrion.com");
        user.setPassword(passwordEncoder.encode("123456"));
        user.setRole("ADMIN");

        userRepository.save(user);

        QrCode qrcode = new QrCode();
        qrcode.setCode("QR-001");
        qrcode.setUser(user);

        qrRepository.save(qrcode);

        System.out.println("User y Qr creados correctamente!");
    };
}
}

