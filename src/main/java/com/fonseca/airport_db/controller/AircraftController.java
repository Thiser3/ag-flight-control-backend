package com.fonseca.airport_db.controller;

import com.fonseca.airport_db.domain.aircraft.AircraftRepository;
import com.fonseca.airport_db.domain.aircraft.RequestAircraft;
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
}