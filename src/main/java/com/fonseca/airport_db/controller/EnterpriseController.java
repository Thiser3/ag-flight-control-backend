package com.fonseca.airport_db.controller;

import com.fonseca.airport_db.domain.enterprise.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enterprises")
public class EnterpriseController {

    @Autowired
    private EnterpriseRepository repository;

    @GetMapping
    public ResponseEntity getAllEnterprises() {
        var allEnterprises = repository.findAll();
        return ResponseEntity.ok(allEnterprises);
    }
}
