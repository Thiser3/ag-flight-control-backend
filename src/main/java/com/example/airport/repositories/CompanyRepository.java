package com.example.airport.repositories;

//Internal Imports
import com.example.airport.models.entities.Company;

//External Imports
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
