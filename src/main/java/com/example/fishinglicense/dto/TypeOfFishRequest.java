package com.example.fishinglicense.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TypeOfFishRequest {

    @NotBlank(message = "name")
    private String name;
}
