package com.github.kolegran.smarthome.user;

import lombok.Getter;

@Getter
public class UserSimpleDto {
    private final Long id;
    private final String login;
    private final String email;

    public UserSimpleDto(User user) {
        id = user.getId();
        login = user.getLogin();
        email = user.getEmail();
    }
}
