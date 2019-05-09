package com.github.kolegran.smarthome.country.city;

import lombok.Getter;

@Getter
public class CitySimpleDto {
    private final Long id;
    private final String title;

    public CitySimpleDto(City city) {
        this.id = city.getId();
        this.title = city.getTitle();
    }
}
