package com.github.kolegran.smarthome.country.city.address;

import com.github.kolegran.smarthome.country.city.City;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
}
