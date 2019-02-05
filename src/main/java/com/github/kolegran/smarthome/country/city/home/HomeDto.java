package com.github.kolegran.smarthome.country.city.home;

import com.github.kolegran.smarthome.User;
import com.github.kolegran.smarthome.country.city.Address.Address;
import lombok.Getter;

@Getter
public class HomeDto {
    private final Long id;
    //private final User owner;
    //private final Address address;

    public HomeDto(Home home) {
        id = home.getId();
        //owner = home.getOwner();
        //address = home.getAddress();
    }
}
