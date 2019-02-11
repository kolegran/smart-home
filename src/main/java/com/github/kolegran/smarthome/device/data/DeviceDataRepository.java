package com.github.kolegran.smarthome.device.data;

import com.github.kolegran.smarthome.device.data.DeviceData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceDataRepository extends JpaRepository<DeviceData, Long> {
}
