package com.fonseca.airport_db.domain.airport;

public record RequestAirport(int airportID,
                             String name,
                             String icao_code,
                             int gateways,
                             String country,
                             String region,
                             String city,
                             String type){
}
