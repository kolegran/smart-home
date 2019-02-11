package com.github.kolegran.smarthome.home.member;

public class HomeMemberSimpleDto {
    private final Long id;

    public HomeMemberSimpleDto(HomeMember homeMember) {
        id = homeMember.getId();
    }
}
