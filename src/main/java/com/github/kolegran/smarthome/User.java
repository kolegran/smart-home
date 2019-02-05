package com.github.kolegran.smarthome;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue
    private Long id;

    //@OneToMany(mappedBy = "user")
    //private Set<Home> homes = new HashSet<>();
}
