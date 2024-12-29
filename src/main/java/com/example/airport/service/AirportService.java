package com.example.airport.service;

//Internal Imports
import com.example.airport.exception.ObjectNotFoundException;
import com.example.airport.models.entities.Airport;
import com.example.airport.repositories.AirportRepository;

//External Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

//Java Imports
import java.util.List;
import java.util.Optional;

@Configuration
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> searchAllAirports(){

        return airportRepository.findAll();

    }

    public Airport searchAirportByID(Long id){

        Optional<Airport> airport = airportRepository.findById(id);

        return airport.orElseThrow(() -> new
                ObjectNotFoundException("Airport not found."));

    }

    public Page<Airport> searchAirportByPage(PageRequest page){

        Optional<Page<Airport>> airportsAtPage = Optional.of(airportRepository.findAll(page));

        return airportsAtPage.orElseThrow(() -> new
                ObjectNotFoundException("Page not found"));

    }

    public Airport saveAirport(Airport airport){

        return airportRepository.save(airport);

    }

    public Airport updateAirport(Long id, Airport airport){

        Airport airportDB = airportRepository.findById(id).orElse(null);

        if(airportDB != null){

            airportDB.setName(airport.getName());
            airportDB.setAvailable(airport.getAvailable());
            airportDB.setGateways(airport.getGateways());
            airportDB.setActive(airport.getActive());

            return airportRepository.save(airportDB);

        } else {

            return null;

        }

    }

    public String deleteCompany(Long id){

        Airport airport = airportRepository.findById(id).orElse(null);

        if(airport != null){

            airportRepository.deleteById(id);
            return "Airport Deleted!";

        } else {

            return "Airport not found.";

        }

    }
}
