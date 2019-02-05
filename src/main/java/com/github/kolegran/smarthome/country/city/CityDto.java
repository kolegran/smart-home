package com.github.kolegran.smarthome.country.city;

import com.github.kolegran.smarthome.country.Country;
import lombok.Getter;

@Getter
public class CityDto {
    private final Long id;
    private final String name;
    private final Country country;

    public CityDto(City city) {
        id = city.getId();
        name = city.getName();
        country = city.getCountry();
    }
}
