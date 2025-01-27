package com.example.fishinglicense.repository;


import com.example.fishinglicense.model.TypeOfFish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeOfFishRepository extends JpaRepository<TypeOfFish, Long> {

    Optional<TypeOfFish> findByName(String name);
}
