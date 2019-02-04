package com.github.kolegran.smarthome.country;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/api/countries")
    public ResponseEntity<List<CountryDto>> getAllCountries() {
        return ResponseEntity.ok(countryService.getAll());
    }

    @PostMapping("/api/countries")
    public ResponseEntity<CountryDto> createCountry(@RequestBody @Valid CreateCountryCommand command) {
        return ResponseEntity.ok(countryService.create(command));
    }

}
