package com.example.fishinglicense.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FishingAreaFish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fishing_area_id", nullable = false)
    private FishingArea fishingArea;

    @ManyToOne
    @JoinColumn(name = "type_of_fish_id", nullable = false)
    private TypeOfFish typeOfFish;

}
