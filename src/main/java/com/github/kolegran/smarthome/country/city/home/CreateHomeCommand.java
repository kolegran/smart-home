package com.github.kolegran.smarthome.country.city.home;

import com.github.kolegran.smarthome.User;
import com.github.kolegran.smarthome.country.city.Address.Address;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class CreateHomeCommand {
    //@NotNull
    //@Length(min = 2, max = 50)
    //private User owner;
    //@NotNull
    //@Length(min = 2, max = 100)
    //private Address address;
}
