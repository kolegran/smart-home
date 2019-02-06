package com.github.kolegran.smarthome.user;

import com.github.kolegran.smarthome.home.HomeSimpleDto;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class UserDto extends UserSimpleDto {
    private final Set<HomeSimpleDto> homes;

    public UserDto(User user) {
        super(user);

        homes = user.getHomes().stream()
                .map(HomeSimpleDto::new)
                .collect(Collectors.toSet());
    }
}
