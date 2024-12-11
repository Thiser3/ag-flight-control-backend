package com.fonseca.airport_db.domain.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Airport
{

    private String icao_code;
    private String name;
    private int gateways;
    private String country;
    private String region;
    private String city;

}
