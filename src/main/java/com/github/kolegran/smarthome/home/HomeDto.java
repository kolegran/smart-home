package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.AddressDto;
import com.github.kolegran.smarthome.user.UserSimpleDto;
import lombok.Getter;

@Getter
public class HomeDto extends HomeSimpleDto {
    private final AddressDto address;
    private final UserSimpleDto user;

    public HomeDto(Home home) {
        super(home);

        address = new AddressDto(home.getAddress());
        user = new UserSimpleDto(home.getOwner());
    }
}
