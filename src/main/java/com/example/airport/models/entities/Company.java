package com.example.airport.models.entities;

//External Imports
import com.example.airport.models.records.RequestCompany;
import jakarta.persistence.*;

//Java Imports
import java.util.Objects;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true)
    private String name;

    public Company(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company(RequestCompany requestCompany){
        this.name = requestCompany.name();
    }
    public Company() {

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
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
