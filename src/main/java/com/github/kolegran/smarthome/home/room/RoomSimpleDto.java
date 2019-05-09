package com.github.kolegran.smarthome.home.room;

import lombok.Getter;

@Getter
public class RoomSimpleDto {
    private final Long id;
    private final String title;
    private final int floor;

    public RoomSimpleDto(Room room) {
        this.id = room.getId();
        this.title = room.getTitle();
        this.floor = room.getFloor();
    }
}
