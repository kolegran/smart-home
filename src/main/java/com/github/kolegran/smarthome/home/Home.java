package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Home {
    @Id
    @GeneratedValue
    private Long id;

    //private Set<Room> rooms = new HashSet<>();
    //private User owner;
    //private Set<Device> devices = new HashSet<>();
    //private Set<User> tenants = new HashSet<>();

    @ManyToOne
    private Address address;
}
