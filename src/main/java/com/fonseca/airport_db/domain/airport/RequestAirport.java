package com.fonseca.airport_db.domain.airport;

import org.jetbrains.annotations.NotNull;

public record RequestAirport(@NotNull
                             Integer airportID,

                             @NotNull
                             String name,

                             @NotNull
                             String icao_code,

                             @NotNull
                             Integer gateways,

                             @NotNull
                             String country,

                             @NotNull
                             String region,

                             @NotNull
                             String city,

                             @NotNull
                             String type){
}
