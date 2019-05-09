package com.github.kolegran.smarthome.home.member;

import com.github.kolegran.smarthome.home.HomeSimpleDto;
import com.github.kolegran.smarthome.user.UserSimpleDto;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HomeMemberDto extends HomeMemberSimpleDto{
    private final HomeSimpleDto home;
    private final UserSimpleDto user;
    private final HomeMemberRole[] role;

    public HomeMemberDto(HomeMember homeMember) {
        super(homeMember);

        this.home = new HomeSimpleDto(homeMember.getHome());
        this.user = new UserSimpleDto(homeMember.getUser());
        this.role = HomeMemberRole.values();
    }
}
