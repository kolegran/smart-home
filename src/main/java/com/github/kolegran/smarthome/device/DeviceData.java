package com.github.kolegran.smarthome.device;

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
    private Timestamp createdAt;

    @Enumerated(EnumType.STRING)
    private MeasurementType type;
    private Double value;
}
