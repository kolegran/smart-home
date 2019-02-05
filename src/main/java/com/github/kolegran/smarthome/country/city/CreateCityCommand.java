package com.github.kolegran.smarthome.country.city;

import com.github.kolegran.smarthome.country.Country;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateCityCommand {
    @NotNull
    @Length(min = 2, max = 100)
    private Country country;
    @NotNull
    @Length(min = 2, max = 100)
    private String name;
}
