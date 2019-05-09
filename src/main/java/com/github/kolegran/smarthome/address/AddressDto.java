package com.github.kolegran.smarthome.address;

import com.github.kolegran.smarthome.country.city.CitySimpleDto;
import com.github.kolegran.smarthome.home.HomeSimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class AddressDto extends AddressSimpleDto {
    private final CitySimpleDto city;
    private final Set<HomeSimpleDto> homes;

    public AddressDto(Address address) {
        super(address);

        this.city = new CitySimpleDto(address.getCity());
        this.homes = address.getHomes().stream()
                .map(HomeSimpleDto::new)
                .collect(Collectors.toSet());
    }
}
