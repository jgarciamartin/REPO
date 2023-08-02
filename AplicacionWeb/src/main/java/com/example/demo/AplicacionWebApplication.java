package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class AplicacionWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionWebApplication.class, args);
	}
	
	@Bean
	SpringDataDialect springDataDialect(){
		return new SpringDataDialect();
	}
}
