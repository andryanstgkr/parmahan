package com.parmahan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.parmahan.src")
public class ParmahanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParmahanApplication.class, args);
	}

	
}
