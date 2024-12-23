package com.example.airport.repositories;

//Internal Imports
import com.example.airport.models.entities.Airport;

//External Imports
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
