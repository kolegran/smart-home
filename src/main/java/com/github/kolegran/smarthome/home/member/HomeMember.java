package com.github.kolegran.smarthome.home.member;

import com.github.kolegran.smarthome.home.Home;
import com.github.kolegran.smarthome.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class HomeMember {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Home home;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HomeMemberRole role;
}
