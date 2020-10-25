package com.skilldistillery.enginecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.jpaengine")
public class EngineCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngineCrudApplication.class, args);
	}

}
