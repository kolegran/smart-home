package com.github.kolegran.smarthome.device.data;

import com.github.kolegran.smarthome.device.data.DeviceData;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class DeviceDataSimpleDto {
    private final Long id;
    private final Timestamp createdAt;
    private final Double value;

    public DeviceDataSimpleDto(DeviceData deviceData) {
        id = deviceData.getId();
        createdAt = deviceData.getCreatedAt();
        value = deviceData.getValue();
    }
}
