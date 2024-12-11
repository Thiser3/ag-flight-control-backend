package com.fonseca.airport_db.domain.flight;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flight
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightID;
    private Integer startingAirportID;
    private Integer destinyAirportID;
    private Integer aircraftID;

}
