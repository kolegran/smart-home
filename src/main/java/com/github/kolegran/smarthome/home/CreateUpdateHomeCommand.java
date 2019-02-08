package com.github.kolegran.smarthome.home;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateUpdateHomeCommand {
    @NotNull
    private Long addressId;
}
