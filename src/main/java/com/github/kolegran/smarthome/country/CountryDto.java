package com.github.kolegran.smarthome.country;

import com.github.kolegran.smarthome.country.city.CitySimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class CountryDto extends CountrySimpleDto {
    private final Set<CitySimpleDto> cities;

    public CountryDto(Country country) {
        super(country);

        this.cities = country.getCities().stream()
                .map(CitySimpleDto::new)
                .collect(Collectors.toSet());
    }
}
