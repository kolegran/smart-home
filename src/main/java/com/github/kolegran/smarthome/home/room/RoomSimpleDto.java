package com.github.kolegran.smarthome.home.room;

import lombok.Getter;

@Getter
public class RoomSimpleDto {
    private final Long id;
    private final String name;
    private final int floor;

    public RoomSimpleDto(Room room) {
        id = room.getId();
        name = room.getName();
        floor = room.getFloor();
    }
}
