package com.fonseca.airport_db.domain.aircraft;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Aircraft
{
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer aircraftID;
        private Integer modelID;
        private Integer enterpriseID;
        private Integer flightID;

}
