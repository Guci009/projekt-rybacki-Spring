package com.example.fishinglicense.mapper;

import com.example.fishinglicense.dto.TypeOfFishRequest;
import com.example.fishinglicense.dto.TypeOfFishResponse;
import com.example.fishinglicense.model.TypeOfFish;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-27T15:16:37+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class TypeOfFishMapperImpl implements TypeOfFishMapper {

    @Override
    public TypeOfFish toEntity(TypeOfFishRequest typeOfFishRequest) {
        if ( typeOfFishRequest == null ) {
            return null;
        }

        TypeOfFish.TypeOfFishBuilder typeOfFish = TypeOfFish.builder();

        typeOfFish.name( typeOfFishRequest.getName() );

        return typeOfFish.build();
    }

    @Override
    public TypeOfFishResponse toResponse(TypeOfFish typeOfFish) {
        if ( typeOfFish == null ) {
            return null;
        }

        TypeOfFishResponse typeOfFishResponse = new TypeOfFishResponse();

        typeOfFishResponse.setName( typeOfFish.getName() );

        return typeOfFishResponse;
    }
}
