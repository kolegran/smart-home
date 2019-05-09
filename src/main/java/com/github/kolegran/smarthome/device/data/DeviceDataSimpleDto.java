package com.github.kolegran.smarthome.device.data;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class DeviceDataSimpleDto {
    private final Long id;
    private final Timestamp createdAt;
    private final Double value;

    public DeviceDataSimpleDto(DeviceData deviceData) {
        this.id = deviceData.getId();
        this.createdAt = deviceData.getCreatedAt();
        this.value = deviceData.getValue();
    }
}
