package com.github.kolegran.smarthome.country.city.Address;

import com.github.kolegran.smarthome.country.city.City;
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
    //@NotNull
    //@Length(min = 2, max = 100)
    //private City city;
}
