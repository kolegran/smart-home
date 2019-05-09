package com.github.kolegran.smarthome.country;

import lombok.Getter;

@Getter
public class CountrySimpleDto {
    private final Long id;
    private final String title;

    public CountrySimpleDto(Country country) {
        this.id = country.getId();
        this.title = country.getTitle();
    }
}
