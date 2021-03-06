package com.github.kolegran.smarthome.home.room;

import com.github.kolegran.smarthome.device.Device;
import com.github.kolegran.smarthome.home.Home;
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
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int floor;

    @ManyToOne(optional = false)
    private Home home;

    @OneToMany(mappedBy = "room")
    private Set<Device> devices = new HashSet<>();
}
