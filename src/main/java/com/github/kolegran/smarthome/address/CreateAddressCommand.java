package com.github.kolegran.smarthome.address;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateAddressCommand {
    @NotNull
    @Length(min = 2, max = 50)
    private String line1;

    @NotNull
    @Length(min = 2, max = 50)
    private String line2;

    @NotNull
    private Long cityId;
}
