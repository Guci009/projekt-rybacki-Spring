package com.example.fishinglicense.mapper;

import com.example.fishinglicense.dto.*;

import com.example.fishinglicense.model.FishingAreaFish;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FishingAreaFishMapper {
    @Mapping(source = "fishId", target = "typeOfFish.id")
    @Mapping(source = "fishingAreaId", target = "fishingArea.id")
    FishingAreaFish toEntity(FishingAreaFishRequest FishingAreaFishRequest);
    @Mapping(source = "typeOfFish.id", target = "fishId")
    @Mapping(source = "fishingArea.id", target = "fishingAreaId")
    FishingAreaFishResponse toResponse(FishingAreaFish fishingAreaFish);
}
