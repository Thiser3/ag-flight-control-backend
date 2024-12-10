package com.fonseca.airport_db.domain.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flight
{

    private int startingAirportID;
    private int destinyAirportID;
    private int aircraftID;

}
