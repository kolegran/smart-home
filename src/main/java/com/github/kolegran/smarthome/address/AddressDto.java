package com.github.kolegran.smarthome.address;

import com.github.kolegran.smarthome.home.HomeSimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class AddressDto extends AddressSimpleDto {
    private final Set<HomeSimpleDto> homes;

    public AddressDto(Address address) {
        super(address);

        homes = address.getHomes().stream()
                .map(HomeSimpleDto::new)
                .collect(Collectors.toSet());
    }
}
