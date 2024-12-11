package com.fonseca.airport_db.controller;

import com.fonseca.airport_db.domain.enterprise.EnterpriseRepository;
import com.fonseca.airport_db.domain.enterprise.RequestEnterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity registerEnterprise(@RequestBody @Validated RequestEnterprise data) {
        System.out.println(data);
        return ResponseEntity.ok().build();
    }

}
