package com.fonseca.airport_db.controller;

import com.fonseca.airport_db.domain.airport.AirportRepository;
import com.fonseca.airport_db.domain.airport.RequestAirport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    public AirportRepository repository;

    @GetMapping
    public ResponseEntity getAllAirport() {
        var allAirports = repository.findAll();
        return ResponseEntity.ok(allAirports);
    }

    @PostMapping
    public ResponseEntity registerAirport(@RequestBody @Validated RequestAirport data){
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}
