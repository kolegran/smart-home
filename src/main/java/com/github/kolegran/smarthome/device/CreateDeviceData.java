package com.github.kolegran.smarthome.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class CreateDeviceData {
    @NotNull
    private Timestamp createdAt;

    @NotNull
    private Double value;
}
