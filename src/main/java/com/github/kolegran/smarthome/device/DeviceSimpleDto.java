package com.github.kolegran.smarthome.device;

import lombok.Getter;

@Getter
public class DeviceSimpleDto {
    private final Long id;
    private final String title;

    public DeviceSimpleDto(Device device) {
        this.id = device.getId();
        this.title = device.getTitle();
    }
}
