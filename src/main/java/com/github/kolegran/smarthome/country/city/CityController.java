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
                                              @RequestBody @Valid CreateUpdateCityCommand command) {
        return ResponseEntity.ok(cityService.create(command, countryId));
    }

    @PutMapping("/api/countries/{countryId}/cities/{cityId}")
    public ResponseEntity<CityDto> updateCityById(@PathVariable Long cityId,
                                                  @RequestBody @Valid CreateUpdateCityCommand command,
                                                  @PathVariable Long countryId) {
        return ResponseEntity.ok(cityService.updateById(cityId, command, countryId));
    }

    @DeleteMapping("/api/countries/{countryId}/cities/{cityId}")
    public ResponseEntity<Void> deleteCityById(@PathVariable Long cityId) {
        cityService.deleteById(cityId);
        return ResponseEntity.ok().build();
    }
}
