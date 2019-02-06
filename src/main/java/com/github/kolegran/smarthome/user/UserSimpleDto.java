package com.github.kolegran.smarthome.user;

import lombok.Getter;

@Getter
public class UserSimpleDto {
    private final Long id;

    public UserSimpleDto(User user) {
        id = user.getId();
    }
}
