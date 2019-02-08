package com.github.kolegran.smarthome.device;

import lombok.Getter;

@Getter
public class DeviceSimpleDto {
    private final Long id;
    private final String name;

    public DeviceSimpleDto(Device device) {
        id = device.getId();
        name = device.getName();
    }
}
