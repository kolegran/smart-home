package com.github.kolegran.smarthome.device;

import com.github.kolegran.smarthome.device.data.DeviceData;
import com.github.kolegran.smarthome.home.Home;
import com.github.kolegran.smarthome.home.room.Room;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Device {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "device")
    private List<DeviceData> deviceDataList = new ArrayList<>();

    @ManyToOne(optional = false)
    private Room room;

    @ManyToOne(optional = false)
    private Home home;
}
