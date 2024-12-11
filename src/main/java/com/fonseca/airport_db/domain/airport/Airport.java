package com.fonseca.airport_db.domain.airport;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Airport
{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int airportID;
    private String icao_code;
    private String name;
    private int gateways;
    private String country;
    private String region;
    private String city;
    private String type;

}
