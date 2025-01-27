package com.example.fishinglicense.service;

import com.example.fishinglicense.dto.*;
import com.example.fishinglicense.mapper.FishingAreaFishMapper;
import com.example.fishinglicense.model.FishingAreaFish;
import com.example.fishinglicense.repository.FishingAreaFishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FishingAreaFishService {
    private final FishingAreaFishRepository fishRepository;
    private final FishingAreaFishMapper fishMapper;

    public List<FishingAreaFishResponse> getAllFishes() {
        return fishRepository.findAll()
                .stream()
                .map(fishMapper::toResponse)
                .collect(Collectors.toList());
    }

    public FishingAreaFishResponse getFishById(Long id) {
        FishingAreaFish fish = fishRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("fish not found with id: " + id));
        return fishMapper.toResponse(fish);
    }

    public FishingAreaFishResponse createFish(FishingAreaFishRequest fishRequest) {
        FishingAreaFish fish = fishMapper.toEntity(fishRequest);
        FishingAreaFish savedFish = fishRepository.save(fish);
        return fishMapper.toResponse(savedFish);
    }

    public FishingAreaFishResponse updateFish(Long id, FishingAreaFishRequest fishRequest) {
        return fishRepository.findById(id)
                .map(fish -> {
                    return fishMapper.toResponse(fishRepository.save(fish));
                })
                .orElseThrow(() -> new RuntimeException("fish not found with id: " + id));
    }

    public void deletefish(Long id) {
        fishRepository.deleteById(id);
    }

    public List<FishingAreaFishResponse> getAreasByFishId(Long typeOfFishId) {
        return fishRepository.findByTypeOfFishId(typeOfFishId)
                .stream()
                .map(fishMapper::toResponse)
                .collect(Collectors.toList());
    }

    public List<FishingAreaFishResponse> getFishesByFishingAreaId(Long fishingAreaId) {
        return fishRepository.findByFishingAreaId(fishingAreaId)
                .stream()
                .map(fishMapper::toResponse)
                .collect(Collectors.toList());
    }

}
