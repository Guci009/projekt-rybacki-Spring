package com.example.fishinglicense.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FishingAreaFishRequest {

    @NotNull(message = "Fish ID is required")
    private Long FishId;

    @NotNull(message = "Fishing Area ID is required")
    private Long fishingAreaId;
}
