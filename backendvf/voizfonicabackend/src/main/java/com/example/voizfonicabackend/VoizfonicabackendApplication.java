package com.example.voizfonicabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.voizfonicabackend.service","com.example.voizfonicabackend.controller"})
@EntityScan(basePackages = "com.example.voizfonicabackend.entity")
@EnableJpaRepositories(basePackages = "com.example.voizfonicabackend.dao")
public class VoizfonicabackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoizfonicabackendApplication.class, args);
	}

}
