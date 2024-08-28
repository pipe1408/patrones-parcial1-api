package com.patrones.parcial1_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Parcial1ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Parcial1ApiApplication.class, args);
	}

}
