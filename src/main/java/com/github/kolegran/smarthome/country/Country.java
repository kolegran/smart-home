package com.github.kolegran.smarthome.country;

import com.github.kolegran.smarthome.country.city.City;
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
public class Country {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "country")
    private Set<City> cities = new HashSet<>();
}
