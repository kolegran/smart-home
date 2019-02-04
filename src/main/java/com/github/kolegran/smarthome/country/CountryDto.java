package com.github.kolegran.smarthome.country;

import lombok.Getter;

@Getter
public class CountryDto {
    private final Long id;
    private final String name;

    public CountryDto(Country country) {
        id = country.getId();
        name = country.getName();
    }
}
