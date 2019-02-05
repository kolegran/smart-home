package com.github.kolegran.smarthome.country.city;

import com.github.kolegran.smarthome.country.CountrySimpleDto;
import lombok.Getter;

@Getter
public class CityDto extends CitySimpleDto {
    private final CountrySimpleDto country;

    public CityDto(City city) {
        super(city);
        country = new CountrySimpleDto(city.getCountry());
    }
}
