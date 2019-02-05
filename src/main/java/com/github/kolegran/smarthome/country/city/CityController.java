package com.github.kolegran.smarthome.country.city;

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
public class CityController {
    private final CityService cityService;

    @GetMapping("/api/cities")
    public ResponseEntity<List<CityDto>> getAllCities() {
        return ResponseEntity.ok(cityService.getAll());
    }

    @PostMapping("/api/cities")
    public ResponseEntity<CityDto> createCity(@RequestBody @Valid CreateCityCommand command) {
        return ResponseEntity.ok(cityService.create(command));
    }
}
