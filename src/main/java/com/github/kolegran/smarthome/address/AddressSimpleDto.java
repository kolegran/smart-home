package com.github.kolegran.smarthome.address;

import com.github.kolegran.smarthome.country.city.CitySimpleDto;
import lombok.Getter;

@Getter
public class AddressSimpleDto {
    private final Long id;
    private final String line1;
    private final String line2;
    private final CitySimpleDto city;

    public AddressSimpleDto(Address address) {
        id = address.getId();
        line1 = address.getLine1();
        line2 = address.getLine2();
        city = new CitySimpleDto(address.getCity());
    }
}
