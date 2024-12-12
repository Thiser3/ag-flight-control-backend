package com.fonseca.airport_db.domain.airport;

import org.jetbrains.annotations.NotNull;

public record RequestAirportPut(@NotNull
                                Integer airportID,

                                 String name,

                                 String icao_code,

                                 Integer gateways,

                                 String country,

                                 String region,

                                 String city,

                                 String type){
}
