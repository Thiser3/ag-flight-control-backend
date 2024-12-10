package com.fonseca.airport_db.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Airport
{

    private String ICAO_Code;
    private String name;
    private int gateways;
    private String Country;
    private String Region;
    private String City;

}
