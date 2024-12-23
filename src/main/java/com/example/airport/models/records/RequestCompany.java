package com.example.airport.models.records;

//External Imports
import jakarta.validation.constraints.NotBlank;

public record RequestCompany(@NotBlank
                             String name){
}
