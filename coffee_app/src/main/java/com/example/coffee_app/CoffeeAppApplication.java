package com.example.coffee_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.coffee_app.classes") // Escaneia entidades
@EnableJpaRepositories(basePackages = "com.example.coffee_app.repositories") // Escaneia repositórios
public class CoffeeAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(CoffeeAppApplication.class, args);
	}
}