package com.github.kolegran.smarthome.country.city;

import com.github.kolegran.smarthome.country.Country;
import com.github.kolegran.smarthome.address.Address;
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
public class City {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Country country;

    @Column(nullable = false)
    private String title;

    @OneToMany(mappedBy = "city")
    private Set<Address> addresses = new HashSet<>();
}
