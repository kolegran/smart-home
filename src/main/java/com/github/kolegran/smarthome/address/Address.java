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

    @Column(nullable = false)
    private String line1;

    @Column(nullable = false)
    private String line2;

    @ManyToOne(optional = false)
    private City city;

    @OneToMany(mappedBy = "address")
    private Set<Home> homes = new HashSet<>();
}
