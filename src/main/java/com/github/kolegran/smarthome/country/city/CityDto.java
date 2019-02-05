package com.github.kolegran.smarthome.country.city;

import lombok.Getter;

@Getter
public class CityDto {
    private final Long id;
    private final String name;
    // private final Country country;

    public CityDto(City city) {
        id = city.getId();
        name = city.getName();
        // country = city.country.getName();
    }
}
