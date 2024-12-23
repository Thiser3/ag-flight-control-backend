package com.example.airport.controller;

//Internal Imports
import com.example.airport.models.entities.Company;
import com.example.airport.models.records.RequestCompany;
import com.example.airport.service.CompanyService;

//External Imports
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Java Imports
import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/")
    public ResponseEntity<List<Company>> searchAllCompanies(){

        List<Company> companyList = companyService.searchAllCompanies();
        return ResponseEntity.ok().body(companyList);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> searchCompanyByID(@PathVariable("id") Long id){

        Company company = companyService.searchCompanyByID(id);
        return ResponseEntity.ok().body(company);

    }

    @PostMapping("/")
    public ResponseEntity<Company> createCompany(@RequestBody @Valid RequestCompany data) {

        Company newCompany = new Company(data);
        companyService.saveCompany(newCompany);
        return new ResponseEntity<>(newCompany, HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@PathVariable("id") Long id, Company company){

        company = companyService.updateCompany(id, company);
        return ResponseEntity.ok().body(company);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompanyByID(@PathVariable("id") Long id){

        String status = companyService.deleteCompany(id);
        return ResponseEntity.ok().body(status);

    }

}
