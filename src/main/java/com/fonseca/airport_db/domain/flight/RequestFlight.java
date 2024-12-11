package com.fonseca.airport_db.domain.flight;

public record RequestFlight(int flightID,
                            int startingAirportID,
                            int destinyAirportID,
                            int aircraftID){
}