package com.github.kolegran.smarthome.country;

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

    @Transactional(readOnly = true)
    public CountryDto getById(Long countryId) {
        return new CountryDto(countryRepository.getOne(countryId));
    }

    @Transactional
    public CountryDto create(CreateCountryCommand command) {
        Country country = new Country();
        country.setName(command.getName());
        return new CountryDto(countryRepository.save(country));
    }

    @Transactional
    public CountryDto updateById(Long countryId) {
        Country updateCountry = countryRepository.getOne(countryId);
        // updating...
        return new CountryDto(countryRepository.save(updateCountry));
    }

    @Transactional
    public void deleteById(Long countryId) {
        countryRepository.deleteById(countryId);
    }

}
