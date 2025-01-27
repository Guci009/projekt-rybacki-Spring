package com.example.fishinglicense.mapper;

import com.example.fishinglicense.dto.FishingAreaFishRequest;
import com.example.fishinglicense.dto.FishingAreaFishResponse;
import com.example.fishinglicense.model.FishingArea;
import com.example.fishinglicense.model.FishingAreaFish;
import com.example.fishinglicense.model.TypeOfFish;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-27T15:16:37+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class FishingAreaFishMapperImpl implements FishingAreaFishMapper {

    @Override
    public FishingAreaFish toEntity(FishingAreaFishRequest FishingAreaFishRequest) {
        if ( FishingAreaFishRequest == null ) {
            return null;
        }

        FishingAreaFish.FishingAreaFishBuilder fishingAreaFish = FishingAreaFish.builder();

        fishingAreaFish.typeOfFish( fishingAreaFishRequestToTypeOfFish( FishingAreaFishRequest ) );
        fishingAreaFish.fishingArea( fishingAreaFishRequestToFishingArea( FishingAreaFishRequest ) );

        return fishingAreaFish.build();
    }

    @Override
    public FishingAreaFishResponse toResponse(FishingAreaFish fishingAreaFish) {
        if ( fishingAreaFish == null ) {
            return null;
        }

        FishingAreaFishResponse fishingAreaFishResponse = new FishingAreaFishResponse();

        fishingAreaFishResponse.setFishId( fishingAreaFishTypeOfFishId( fishingAreaFish ) );
        fishingAreaFishResponse.setFishingAreaId( fishingAreaFishFishingAreaId( fishingAreaFish ) );

        return fishingAreaFishResponse;
    }

    protected TypeOfFish fishingAreaFishRequestToTypeOfFish(FishingAreaFishRequest fishingAreaFishRequest) {
        if ( fishingAreaFishRequest == null ) {
            return null;
        }

        TypeOfFish.TypeOfFishBuilder typeOfFish = TypeOfFish.builder();

        typeOfFish.id( fishingAreaFishRequest.getFishId() );

        return typeOfFish.build();
    }

    protected FishingArea fishingAreaFishRequestToFishingArea(FishingAreaFishRequest fishingAreaFishRequest) {
        if ( fishingAreaFishRequest == null ) {
            return null;
        }

        FishingArea.FishingAreaBuilder fishingArea = FishingArea.builder();

        fishingArea.id( fishingAreaFishRequest.getFishingAreaId() );

        return fishingArea.build();
    }

    private Long fishingAreaFishTypeOfFishId(FishingAreaFish fishingAreaFish) {
        TypeOfFish typeOfFish = fishingAreaFish.getTypeOfFish();
        if ( typeOfFish == null ) {
            return null;
        }
        return typeOfFish.getId();
    }

    private Long fishingAreaFishFishingAreaId(FishingAreaFish fishingAreaFish) {
        FishingArea fishingArea = fishingAreaFish.getFishingArea();
        if ( fishingArea == null ) {
            return null;
        }
        return fishingArea.getId();
    }
}
