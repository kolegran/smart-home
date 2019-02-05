package com.github.kolegran.smarthome;

import java.util.HashSet;
import java.util.Set;

public class Room {
    //private Home home;
    private String name;
    private int floor;
    private Set<Device> devices = new HashSet<>();
}
