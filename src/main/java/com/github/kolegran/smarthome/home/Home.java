package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.Address;
import com.github.kolegran.smarthome.device.Device;
import com.github.kolegran.smarthome.home.member.HomeMember;
import com.github.kolegran.smarthome.home.room.Room;
import com.github.kolegran.smarthome.user.User;
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

    @OneToMany(mappedBy = "home")
    private Set<Room> rooms = new HashSet<>();

    @OneToMany(mappedBy = "home")
    private Set<Device> devices = new HashSet<>();

    @ManyToOne
    private Address address;

    @OneToMany(mappedBy = "home")
    private Set<HomeMember> members = new HashSet<>();
}
