package com.github.kolegran.smarthome.device;

import lombok.Getter;

@Getter
public class DeviceDataDto extends DeviceDataSimpleDto{
    private final DeviceSimpleDto device;

    public DeviceDataDto(DeviceData deviceData) {
        super(deviceData);

        device = new DeviceSimpleDto(deviceData.getDevice());
    }
}
