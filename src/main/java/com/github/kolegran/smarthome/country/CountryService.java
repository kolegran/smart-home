package com.github.kolegran.smarthome.country;

import com.github.kolegran.smarthome.country.city.CitySimpleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;

    @Transactional(readOnly = true)
    public List<CountrySimpleDto> getAll() {
        return countryRepository.findAll()
                .stream()
                .map(CountrySimpleDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public CountryDto create(CreateCountryCommand command) {
        Country country = new Country();
        country.setName(command.getName());
        return new CountryDto(countryRepository.save(country));
    }

    @Transactional(readOnly = true)
    public CountryDto getById(Long countryId) {
        return new CountryDto(countryRepository.getOne(countryId));
    }
}
