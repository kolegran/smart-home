package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.AddressDto;
import com.github.kolegran.smarthome.home.room.RoomSimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class HomeDto extends HomeSimpleDto {
    private final AddressDto address;
    private final Set<RoomSimpleDto> rooms;
    // members
    // devices

    public HomeDto(Home home) {
        super(home);

        address = new AddressDto(home.getAddress());

        rooms = home.getRooms().stream()
                .map(RoomSimpleDto::new)
                .collect(Collectors.toSet());
    }
}
