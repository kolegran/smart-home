package com.github.kolegran.smarthome.home;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateHomeCommand {
    @NotNull
    private Long addressId;
    @NotNull
    private Long ownerId;
}
