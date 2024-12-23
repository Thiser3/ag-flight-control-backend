package com.example.airport.models.entities;

//External Imports
import com.example.airport.models.records.RequestAirport;
import jakarta.persistence.*;


//Java Imports
import java.util.Objects;

@Entity
@Table(name = "airports")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer gateways;

    @Column(nullable = false)
    private Boolean available;

    public Airport(Long id, String name, Integer gateways, Boolean available){
        this.id = id;
        this.name = name;
        this.gateways = gateways;
        this.available = available;
    }

    public Airport(RequestAirport requestAirport) {
        this.name = requestAirport.name();
        this.gateways = requestAirport.gateways();
        this.available = requestAirport.available();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGateways() {
        return gateways;
    }

    public void setGateways(Integer gateways) {
        this.gateways = gateways;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return gateways == airport.gateways && available == airport.available && Objects.equals(id, airport.id) && Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gateways, available);
    }
}
