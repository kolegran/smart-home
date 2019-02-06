package com.github.kolegran.smarthome.home.room;

import com.github.kolegran.smarthome.home.HomeSimpleDto;

public class RoomDto extends RoomSimpleDto {
    public final HomeSimpleDto home;

    public RoomDto(Room room) {
        super(room);
        home = new HomeSimpleDto(room.getHome());
    }
}
