package com.github.kolegran.smarthome.home;

import lombok.Getter;

@Getter
public class HomeSimpleDto {
    private final Long id;

    public HomeSimpleDto(Home home) {
        this.id = home.getId();
    }
}
