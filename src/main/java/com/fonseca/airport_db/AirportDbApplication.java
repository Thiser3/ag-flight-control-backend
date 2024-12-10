package com.fonseca.airport_db;

import com.fonseca.airport_db.DAO.EnterpriseDAO;
import com.fonseca.airport_db.entity.Enterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportDbApplication.class, args);

		Enterprise e = new Enterprise();
		e.setName("teste");

		new EnterpriseDAO().createEnterprise(e);

	}
}
