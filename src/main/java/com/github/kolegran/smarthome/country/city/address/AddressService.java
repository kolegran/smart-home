package com.github.kolegran.smarthome.country.city.address;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    @Transactional(readOnly = true)
    public List<AddressDto> getAll() {
        return addressRepository.findAll()
                .stream()
                .map(AddressDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public AddressDto create(CreateAddressCommand command) {
        Address address = new Address();
        address.setLine1(command.getLine1());
        address.setLine2(command.getLine2());
        address.setCity(command.getCity());
        return new AddressDto(addressRepository.save(address));
    }
}
