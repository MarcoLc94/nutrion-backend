package com.nutrion.nutrionbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class NutrionbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutrionbackendApplication.class, args);
	}

	// @Bean
	// CommandLineRunner initData(UserRepository userRepository, QrRepository qrRepository){
	// 	return args -> {
	// 		User user = new User();
	// 		user.setEmail("admin@nutrion.com");
	// 		user.setPassword("123456");
	// 		user.setRole("ADMIN");
	
	// 		userRepository.save(user);
	
	// 		QrCode qrcode = new QrCode();
	// 		qrcode.setCode("QR-001");
	// 		qrcode.setUser(user);
	
	// 		qrRepository.saveAll(List.of(qrcode));
	// 		System.out.println("User y Qr creados correctamente!");
	// 	};
	// }
}

