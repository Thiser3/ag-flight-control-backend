package com.fonseca.airport_db.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enterprises")
public class EnterpriseController {
    @GetMapping
    public ResponseEntity getAllEnterprises() {
        return ResponseEntity.ok("deu ok");
    }
}
