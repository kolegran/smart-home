package com.github.kolegran.smarthome.country.city;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping("/api/countries/{countryId}/cities")
    public ResponseEntity<List<CitySimpleDto>> getAllCities(@PathVariable Long countryId) {
        return ResponseEntity.ok(cityService.getAllByCountryId(countryId));
    }

    @PostMapping("/api/countries/{countryId}/cities")
    public ResponseEntity<CityDto> createCity(@PathVariable Long countryId,
                                              @RequestBody @Valid CreateCityCommand command) {
        return ResponseEntity.ok(cityService.create(command, countryId));
    }
}
