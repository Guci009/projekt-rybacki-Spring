package com.example.fishinglicense.repository;


import com.example.fishinglicense.model.FishingAreaFish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FishingAreaFishRepository extends JpaRepository<FishingAreaFish, Long> {
    List<FishingAreaFish> findByTypeOfFishId(Long typeOfFishId);
    List<FishingAreaFish> findByFishingAreaId(Long fishingAreaId);
}
