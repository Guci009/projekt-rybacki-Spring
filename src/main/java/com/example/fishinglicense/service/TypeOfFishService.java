package com.example.fishinglicense.service;

import com.example.fishinglicense.dto.TypeOfFishRequest;
import com.example.fishinglicense.dto.TypeOfFishResponse;
import com.example.fishinglicense.mapper.TypeOfFishMapper;
import com.example.fishinglicense.model.TypeOfFish;
import com.example.fishinglicense.repository.TypeOfFishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TypeOfFishService {
    private final TypeOfFishRepository fishRepository;
    private final TypeOfFishMapper fishMapper;

    public List<TypeOfFishResponse> getAllFishes() {
        return fishRepository.findAll()
                .stream()
                .map(fishMapper::toResponse)
                .collect(Collectors.toList());
    }

    public TypeOfFishResponse getFishById(Long id) {
        TypeOfFish fish = fishRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fish not found with id: " + id));
        return fishMapper.toResponse(fish);
    }

    public TypeOfFishResponse createFish(TypeOfFishRequest fishRequest) {
        TypeOfFish fish = fishMapper.toEntity(fishRequest);
        TypeOfFish savedFish = fishRepository.save(fish);
        return fishMapper.toResponse(savedFish);
    }

    public TypeOfFishResponse updateFish(Long id, TypeOfFishRequest fishRequest) {
        return fishRepository.findById(id)
                .map(fish -> {
                    fish.setName(fishRequest.getName());
                    return fishMapper.toResponse(fishRepository.save(fish));
                })
                .orElseThrow(() -> new RuntimeException("Fish not found with id: " + id));
    }

    public void deleteFish(Long id) {
        fishRepository.deleteById(id);
    }

}
