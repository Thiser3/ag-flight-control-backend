package com.example.airport.models.records;

//External Imports
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestAirport(@NotBlank
                             String name,

                             @NotNull
                             Boolean available,

                             @NotNull
                             Boolean isActive,

                             @NotNull
                             Integer gateways) {
}
