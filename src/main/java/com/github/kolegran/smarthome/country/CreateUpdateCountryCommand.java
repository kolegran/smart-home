package com.github.kolegran.smarthome.country;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateUpdateCountryCommand {
    @NotNull
    @Length(min = 2, max = 100)
    private String title;
}
