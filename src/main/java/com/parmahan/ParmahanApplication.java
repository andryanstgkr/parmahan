package com.parmahan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.parmahan")
@EnableJpaRepositories
@EnableJpaAuditing
public class ParmahanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParmahanApplication.class, args);
	}

	
}
