package com.github.kolegran.smarthome.device.data;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class CreateDeviceDataCommand {
    @NotNull
    private Long deviceId;

    @NotNull
    private Timestamp createdAt;

    @NotNull
    private Double value;
}
