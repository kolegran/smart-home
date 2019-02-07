package com.github.kolegran.smarthome.address;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/api/addresses/{addressId}")
    public ResponseEntity<AddressDto> updateAddressById(@PathVariable Long addressId) {
        return ResponseEntity.ok(addressService.updateById(addressId));
    }

    @DeleteMapping("/api/addresses/{addressId}")
    public ResponseEntity<Void> deleteAddressById(@PathVariable Long addressId) {
        addressService.deleteById(addressId);
        return ResponseEntity.ok().build();
    }
}
