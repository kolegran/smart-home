package com.github.kolegran.smarthome.device.data;

import com.github.kolegran.smarthome.device.Device;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
public class DeviceData {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    private Device device;

    @Column(nullable = false)
    private Timestamp createdAt;

    @Enumerated(EnumType.STRING)
    private MeasurementType type;

    @Column(nullable = false)
    private Double value;
}
