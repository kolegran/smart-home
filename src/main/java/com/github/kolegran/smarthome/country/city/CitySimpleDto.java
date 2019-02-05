package com.github.kolegran.smarthome.country.city;

import lombok.Getter;

@Getter
public class CitySimpleDto {
    private final Long id;
    private final String name;

    public CitySimpleDto(City city) {
        id = city.getId();
        name = city.getName();
    }
}
