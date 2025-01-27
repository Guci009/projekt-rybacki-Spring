package com.example.fishinglicense.mapper;

import com.example.fishinglicense.dto.TypeOfFishRequest;
import com.example.fishinglicense.dto.TypeOfFishResponse;
import com.example.fishinglicense.model.TypeOfFish;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeOfFishMapper {
    TypeOfFish toEntity(TypeOfFishRequest typeOfFishRequest);
    TypeOfFishResponse toResponse(TypeOfFish typeOfFish);
}
