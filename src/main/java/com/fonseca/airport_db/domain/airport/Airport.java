package com.fonseca.airport_db.domain.airport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Airport
{

    private String ICAO_Code;
    private String name;
    private int gateways;
    private String Country;
    private String Region;
    private String City;

}
