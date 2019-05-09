package com.github.kolegran.smarthome;

import com.github.kolegran.smarthome.address.AddressDto;
import com.github.kolegran.smarthome.address.AddressService;
import com.github.kolegran.smarthome.address.CreateUpdateAddressCommand;
import com.github.kolegran.smarthome.country.CountryDto;
import com.github.kolegran.smarthome.country.CountryService;
import com.github.kolegran.smarthome.country.CreateUpdateCountryCommand;
import com.github.kolegran.smarthome.country.city.CityDto;
import com.github.kolegran.smarthome.country.city.CityService;
import com.github.kolegran.smarthome.country.city.CreateUpdateCityCommand;
import com.github.kolegran.smarthome.home.CreateUpdateHomeCommand;
import com.github.kolegran.smarthome.home.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    private final HomeService homeService;
    private final AddressService addressService;
    private final CityService cityService;
    private final CountryService countryService;

    @Override
    public void run(String... args) throws Exception {
        CreateUpdateCountryCommand countryCommand = new CreateUpdateCountryCommand();
        countryCommand.setTitle("Ukraine");
        CountryDto ukraine = countryService.create(countryCommand);

        CreateUpdateCityCommand command = new CreateUpdateCityCommand();
        command.setTitle("Lviv");
        CityDto cherkassy = cityService.create(command, ukraine.getId());


        CreateUpdateAddressCommand addressCommand = new CreateUpdateAddressCommand();
        addressCommand.setCityId(cherkassy.getId());
        addressCommand.setLine1("Lviv Shevchenka 23");
        addressCommand.setLine2("13");
        AddressDto shevchenka = addressService.create(addressCommand);

        CreateUpdateHomeCommand cmd = new CreateUpdateHomeCommand();
        cmd.setAddressId(shevchenka.getId());
        homeService.create(cmd);
    }
}
