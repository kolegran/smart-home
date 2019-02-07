package com.github.kolegran.smarthome.device;

import com.github.kolegran.smarthome.home.HomeSimpleDto;
import com.github.kolegran.smarthome.home.room.RoomSimpleDto;

import java.util.Set;

public class DeviceDto extends DeviceSimpleDto {
    private final HomeSimpleDto home;
    private final RoomSimpleDto room;
    //private final Set<DeviceData> data;

    public DeviceDto(Device device) {
        super(device);

        home = new HomeSimpleDto(device.getHome());
        room = new RoomSimpleDto(device.getRoom());
    }
}
