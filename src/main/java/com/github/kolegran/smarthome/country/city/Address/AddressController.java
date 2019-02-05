package com.github.kolegran.smarthome.country.city.Address;

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
public class AddressController {
    private final AddressService addressService;

    @GetMapping("/api/addresses")
    public ResponseEntity<List<AddressDto>> getAllAddresses() {
        return ResponseEntity.ok(addressService.getAll());
    }

    @PostMapping("/api/addresses")
    public ResponseEntity<AddressDto> createAddress(@RequestBody @Valid CreateAddressCommand command) {
        return ResponseEntity.ok(addressService.create(command));
    }
}
