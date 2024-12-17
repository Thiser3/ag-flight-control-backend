package com.example.airport.controller;

import com.example.airport.models.Company;
import com.example.airport.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        if (company.getName() == null || company.getName().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        Company savedCompany = companyRepository.save(company);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCompany);
    }
}
