package com.github.kolegran.smarthome.address;

import lombok.Getter;

@Getter
public class AddressSimpleDto {
    private final Long id;
    private final String line1;
    private final String line2;

    public AddressSimpleDto(Address address) {
        this.id = address.getId();
        this.line1 = address.getLine1();
        this.line2 = address.getLine2();
    }
}
