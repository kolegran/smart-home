package com.github.kolegran.smarthome.room;

import com.github.kolegran.smarthome.device.Device;
import com.github.kolegran.smarthome.home.Home;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int floor;

    @ManyToOne
    private Home home;

    //private Set<Device> devices = new HashSet<>();
}
