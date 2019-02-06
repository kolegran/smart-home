package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.AddressDto;
import lombok.Getter;

@Getter
public class HomeDto extends HomeSimpleDto {
    private final AddressDto address;

    public HomeDto(Home home) {
        super(home);

        address = new AddressDto(home.getAddress());
    }
}
