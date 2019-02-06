package com.github.kolegran.smarthome.room;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateRoomCommand {
    @NotNull
    @Length(min = 2, max = 50)
    private String name;

    @NotNull
    private int floor;
}
