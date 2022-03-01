package com.example.entrevue.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = "com.example.entrevue.spring.boot")
public class EntrevueSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntrevueSpringBootApplication.class, args);
	}

}
