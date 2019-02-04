package com.github.kolegran.smarthome.country;

import lombok.Builder;
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
public class Country {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    //private Set<City> cities = new HashSet<>();
}
