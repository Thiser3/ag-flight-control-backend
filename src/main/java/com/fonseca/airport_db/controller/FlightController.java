package com.fonseca.airport_db.controller;

import com.fonseca.airport_db.domain.flight.FlightRepository;
import com.fonseca.airport_db.domain.flight.RequestFlight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository repository;

    @GetMapping
    public ResponseEntity getAllFlights(){
        var allFlights = repository.findAll();
        return ResponseEntity.ok(allFlights);
    }

    @PostMapping
    public ResponseEntity registerFlight(@RequestBody @Validated RequestFlight data){
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}
