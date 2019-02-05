package com.github.kolegran.smarthome.country.city.home;

import com.github.kolegran.smarthome.Device;
import com.github.kolegran.smarthome.Room;
import com.github.kolegran.smarthome.User;
import com.github.kolegran.smarthome.country.city.Address.Address;

import java.util.HashSet;
import java.util.Set;

public class Home {
    private Set<Room> rooms = new HashSet<>();
    private User owner;
    private Set<Device> devices = new HashSet<>();
    private Set<User> tenants = new HashSet<>();
    private Address address;
}
