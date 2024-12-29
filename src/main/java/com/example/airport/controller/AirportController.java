package com.example.airport.controller;

//Internal Imports
import com.example.airport.models.entities.Airport;
import com.example.airport.models.records.RequestAirport;
import com.example.airport.service.AirportService;

//External Imports
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Java Imports
import java.util.List;



@RestController
@RequestMapping("/api/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/")
    public ResponseEntity<List<Airport>> searchAllAirports(){

        List<Airport> allAirports = airportService.searchAllAirports();

        return ResponseEntity.ok().body(allAirports);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Airport> searchAirportByID(Long id){

     Airport airport = airportService.searchAirportByID(id);

     return ResponseEntity.ok().body(airport);

    }

    @GetMapping("/{page}")
    public Page<Airport> searchAirportByPage(@RequestParam Integer page,
                                             @RequestParam Integer itensPerPage,
                                             @RequestParam String ordenation,
                                             @RequestParam String ordenationType){

        PageRequest pageReq = PageRequest.of(page, itensPerPage, (ordenationType.equals("ASC") ?
                Sort.by(ordenation).ascending() : Sort.by(ordenation).descending()));

        return airportService.searchAirportByPage(pageReq);

    }

    @PostMapping("/")
    public ResponseEntity<Airport> createAirport(@RequestBody @Valid RequestAirport data){

        Airport newAirport = new Airport(data);
        airportService.saveAirport(newAirport);

        return new ResponseEntity<>(newAirport,HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Airport> updateAirport(@PathVariable("id") Long id,
                                                 @RequestBody @Valid RequestAirport data,
                                                 Airport airport){

        Airport newAirport = airportService.updateAirport(id, airport);

        return ResponseEntity.ok().body(newAirport);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAirportByID(@PathVariable("id") Long id){

        String status = airportService.deleteCompany(id);

        return ResponseEntity.ok().body(status);

    }

}
