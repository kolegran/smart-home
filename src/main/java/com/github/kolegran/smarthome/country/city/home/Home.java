package com.github.kolegran.smarthome.country.city.home;

import com.github.kolegran.smarthome.Device;
import com.github.kolegran.smarthome.Room;
import com.github.kolegran.smarthome.User;
import com.github.kolegran.smarthome.country.city.Address.Address;
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
public class Home {
    @Id
    @GeneratedValue
    private Long id;

    //private Set<Room> rooms = new HashSet<>();

    //@ManyToOne
    //private User owner;
    //private Set<Device> devices = new HashSet<>();
    //private Set<User> tenants = new HashSet<>();

    //private Address address;
}
