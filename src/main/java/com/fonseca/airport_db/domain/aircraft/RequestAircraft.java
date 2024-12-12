package com.fonseca.airport_db.domain.aircraft;

import org.jetbrains.annotations.NotNull;

public record RequestAircraft(@NotNull
                              Integer aircraftID,

                              @NotNull
                              Integer modelID,

                              @NotNull
                              Integer enterpriseID,

                              Integer flightID,

                              Integer liveAirportID){
}
