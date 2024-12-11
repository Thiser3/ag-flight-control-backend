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
    private int flightID;
    private int startingAirportID;
    private int destinyAirportID;
    private int aircraftID;

}
