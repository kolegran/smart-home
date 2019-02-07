package com.github.kolegran.smarthome.device;

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

    @OneToMany(mappedBy = "device")
    private List<DeviceData> deviceDataList = new ArrayList<>();

    @ManyToOne
    private Room room;

    @ManyToOne(optional = false)
    private Home home;
}
