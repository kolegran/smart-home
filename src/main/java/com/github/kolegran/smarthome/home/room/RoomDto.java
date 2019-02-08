package com.github.kolegran.smarthome.home.room;

import com.github.kolegran.smarthome.device.DeviceSimpleDto;
import com.github.kolegran.smarthome.home.HomeSimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class RoomDto extends RoomSimpleDto {
    public final HomeSimpleDto home;
    public final Set<DeviceSimpleDto> devices;

    public RoomDto(Room room) {
        super(room);

        home = new HomeSimpleDto(room.getHome());

        devices = room.getDevices().stream()
                .map(DeviceSimpleDto::new)
                .collect(Collectors.toSet());
    }
}
