package com.fonseca.airport_db.controller;

import com.fonseca.airport_db.domain.aircraft.Aircraft;
import com.fonseca.airport_db.domain.aircraft.AircraftRepository;
import com.fonseca.airport_db.domain.aircraft.RequestAircraft;
import com.fonseca.airport_db.domain.aircraft.RequestAircraftPut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aircrafts")
public class AircraftController {

    @Autowired
    private AircraftRepository repository;

    @GetMapping
    public ResponseEntity getAllAircrafts() {
        var allAircrafts = repository.findAll();

        return ResponseEntity.ok(allAircrafts);
    }

    @PostMapping
    public ResponseEntity registerAircraft(@RequestBody @Validated RequestAircraft data) {
        System.out.println(data);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity updateAircraft(@RequestBody @Validated RequestAircraftPut data){
        Aircraft aircraft = repository.getReferenceById(data.aircraftID());

        aircraft.setModelID(data.modelID());
        aircraft.setEnterpriseID(data.enterpriseID());
        aircraft.setFlightID(data.flightID());
        aircraft.setLiveAirportID(data.liveAirportID());

        return ResponseEntity.ok(aircraft);
    }
}