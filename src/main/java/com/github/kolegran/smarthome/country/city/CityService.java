package com.github.kolegran.smarthome.country.city;

import com.github.kolegran.smarthome.country.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;

    @Transactional(readOnly = true)
    public List<CityDto> getAll() {
        return cityRepository.findAll()
                .stream()
                .map(CityDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public CityDto create(CreateCityCommand command) {
        City city = new City();
        city.setName(command.getName());
        city.setCountry(countryRepository.getOne(command.getCountryId()));
        return new CityDto(cityRepository.save(city));
    }
}
