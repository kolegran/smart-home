package com.github.kolegran.smarthome.device;

import lombok.Getter;

@Getter
public class DeviceSimpleDto {
    private final Long id;

    public DeviceSimpleDto(Device device) {
        id = device.getId();
    }
}
