package com.github.kolegran.smarthome.country;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/api/countries")
    public ResponseEntity<List<CountrySimpleDto>> getAllCountries() {
        return ResponseEntity.ok(countryService.getAll());
    }

    @GetMapping("/api/countries/{countryId}")
    public ResponseEntity<CountryDto> getCountryById(@PathVariable Long countryId) {
        return ResponseEntity.ok(countryService.getById(countryId));
    }

    @PostMapping("/api/countries")
    public ResponseEntity<CountryDto> createCountry(@RequestBody @Valid CreateUpdateCountryCommand command) {
        return ResponseEntity.ok(countryService.create(command));
    }

    @PutMapping("/api/countries/{countryId}")
    public ResponseEntity<CountryDto> updateCountryById(@PathVariable Long countryId, @RequestBody @Valid CreateUpdateCountryCommand command) {
        return ResponseEntity.ok(countryService.updateById(countryId, command));
    }

    @DeleteMapping("/api/countries/{countryId}")
    public ResponseEntity<Void> deleteCountryById(@PathVariable Long countryId) {
        countryService.deleteById(countryId);
        return ResponseEntity.ok().build();
    }

}
