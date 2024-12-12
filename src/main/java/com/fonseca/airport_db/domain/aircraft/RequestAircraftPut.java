package com.fonseca.airport_db.domain.aircraft;

import org.jetbrains.annotations.NotNull;

public record RequestAircraftPut(@NotNull
                                 Integer aircraftID,

                                 Integer modelID,

                                 Integer enterpriseID,

                                 Integer flightID,

                                 Integer liveAirportID){
}