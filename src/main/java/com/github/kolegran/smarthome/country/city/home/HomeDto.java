package com.github.kolegran.smarthome.country.city.home;

import lombok.Getter;

@Getter
public class HomeDto {
    private final Long id;
    //private final User owner;
    //private final address address;

    public HomeDto(Home home) {
        id = home.getId();
        //owner = home.getOwner();
        //address = home.getAddress();
    }
}
