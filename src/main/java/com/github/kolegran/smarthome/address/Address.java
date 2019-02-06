package com.github.kolegran.smarthome.address;

import com.github.kolegran.smarthome.country.city.City;
import com.github.kolegran.smarthome.home.Home;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String line1;
    private String line2;
    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "address")
    private Set<Home> homes = new HashSet<>();
}
