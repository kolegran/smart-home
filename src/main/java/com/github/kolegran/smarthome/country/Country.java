package com.github.kolegran.smarthome.country;

import com.github.kolegran.smarthome.country.city.City;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

    private String name;
    // OneToMany
    //private Set<City> cities = new HashSet<>();
}
