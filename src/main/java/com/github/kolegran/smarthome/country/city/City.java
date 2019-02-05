package com.github.kolegran.smarthome.country.city;

import com.github.kolegran.smarthome.country.Country;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class City {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Country country;
    private String name;
}
