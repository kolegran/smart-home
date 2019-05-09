package com.github.kolegran.smarthome.device;

import com.github.kolegran.smarthome.device.data.DeviceDataSimpleDto;
import com.github.kolegran.smarthome.home.HomeSimpleDto;
import com.github.kolegran.smarthome.home.room.RoomSimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class DeviceDto extends DeviceSimpleDto {
    private final HomeSimpleDto home;
    private final RoomSimpleDto room;
    private final Set<DeviceDataSimpleDto> data;

    public DeviceDto(Device device) {
        super(device);

        this.home = new HomeSimpleDto(device.getHome());
        this.room = new RoomSimpleDto(device.getRoom());
        this.data = device.getDeviceDataList().stream()
                .map(DeviceDataSimpleDto::new)
                .collect(Collectors.toSet());
    }
}
