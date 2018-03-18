package com.techprimers.security.securitydbexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(value = "http://localhost:4200", maxAge = 3600)
@SpringBootApplication
public class SecurityDbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDbExampleApplication.class, args);
	}
}
