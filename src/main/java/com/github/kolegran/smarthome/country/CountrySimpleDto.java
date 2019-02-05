package com.github.kolegran.smarthome.country;

import lombok.Getter;

@Getter
public class CountrySimpleDto {
    private final Long id;
    private final String name;

    public CountrySimpleDto(Country country) {
        id = country.getId();
        name = country.getName();
    }
}
