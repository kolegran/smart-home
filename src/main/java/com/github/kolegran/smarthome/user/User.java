package com.github.kolegran.smarthome.user;

import com.github.kolegran.smarthome.home.Home;
import com.github.kolegran.smarthome.home.member.HomeMember;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "user")
    private Set<HomeMember> homeMembers = new HashSet<>();
}
