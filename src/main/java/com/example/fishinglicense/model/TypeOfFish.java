package com.example.fishinglicense.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class TypeOfFish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "typeOfFish", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FishingAreaFish> fishingAreaFish;
}
