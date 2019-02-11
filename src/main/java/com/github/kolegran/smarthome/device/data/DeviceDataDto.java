package com.github.kolegran.smarthome.device.data;

import com.github.kolegran.smarthome.device.DeviceSimpleDto;
import lombok.Getter;

@Getter
public class DeviceDataDto extends DeviceDataSimpleDto {
    private final DeviceSimpleDto device;
    private final MeasurementType[] measurementType;

    public DeviceDataDto(DeviceData deviceData) {
        super(deviceData);

        device = new DeviceSimpleDto(deviceData.getDevice());

        measurementType = MeasurementType.values();
    }
}
