package com.fonseca.airport_db.domain.flight;

import org.jetbrains.annotations.NotNull;

public record RequestFlight(@NotNull
                            Integer flightID,

                            @NotNull
                            Integer startingAirportID,

                            @NotNull
                            Integer destinyAirportID,

                            @NotNull
                            Integer aircraftID){
}