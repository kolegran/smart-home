package com.github.kolegran.smarthome.country.city;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateUpdateCityCommand {
    @NotNull
    @Length(min = 2, max = 100)
    private String title;
}
