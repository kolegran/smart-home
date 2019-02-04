package com.github.kolegran.smarthome;

import java.util.HashSet;
import java.util.Set;

public class Home {
    private Set<Room> rooms = new HashSet<>();
    private User owner;
    private Set<Device> devices = new HashSet<>();
    private Set<User> tenants = new HashSet<>();
    private Address address;
}
