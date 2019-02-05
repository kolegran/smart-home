package com.github.kolegran.smarthome.country.city.Address;

import com.github.kolegran.smarthome.country.city.City;
import lombok.Getter;

@Getter
public class AddressDto {
    private final Long id;
    private final String line1;
    private final String line2;
    private final City city;

    public AddressDto(Address address) {
        id = address.getId();
        line1 = address.getLine1();
        line2 = address.getLine2();
        city = address.getCity();
    }
}
