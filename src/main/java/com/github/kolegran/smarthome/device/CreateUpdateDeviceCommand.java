package com.github.kolegran.smarthome.device;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateUpdateDeviceCommand {
    @NotNull
    @Length(min = 2, max = 100)
    private String name;

    @NotNull
    private Long roomId;

    @NotNull
    private Long homeId;
}
