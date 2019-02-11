package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.AddressDto;
import com.github.kolegran.smarthome.device.DeviceSimpleDto;
import com.github.kolegran.smarthome.home.member.HomeMemberSimpleDto;
import com.github.kolegran.smarthome.home.room.RoomSimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class HomeDto extends HomeSimpleDto {
    private final AddressDto address;
    private final Set<RoomSimpleDto> rooms;
    private final Set<DeviceSimpleDto> devices;
    private final Set<HomeMemberSimpleDto> membersRoles;

    public HomeDto(Home home) {
        super(home);

        address = new AddressDto(home.getAddress());

        rooms = home.getRooms().stream()
                .map(RoomSimpleDto::new)
                .collect(Collectors.toSet());

        devices = home.getDevices().stream()
                .map(DeviceSimpleDto::new)
                .collect(Collectors.toSet());

        membersRoles = home.getMembers().stream()
                .map(HomeMemberSimpleDto::new)
                .collect(Collectors.toSet());
    }
}
