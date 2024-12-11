package com.fonseca.airport_db;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.fonseca.airport_db.domain.Enterprise")
public class AirportDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportDbApplication.class, args);


	}
}
