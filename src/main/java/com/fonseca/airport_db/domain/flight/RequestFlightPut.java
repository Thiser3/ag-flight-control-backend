package com.fonseca.airport_db.domain.flight;

import org.jetbrains.annotations.NotNull;

public record RequestFlightPut(@NotNull
                               Integer flightID,

                               Integer startingAirportID,

                               Integer destinyAirportID,

                               Integer aircraftID){
}