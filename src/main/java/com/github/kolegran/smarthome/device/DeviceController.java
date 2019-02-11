package com.github.kolegran.smarthome.device;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DeviceController {
    private DeviceService deviceService;

    @GetMapping("/api/devices")
    public ResponseEntity<List<DeviceSimpleDto>> getAllDevices() {
        return ResponseEntity.ok(deviceService.getAll());
    }

    @GetMapping("/api/devices/{deviceId}")
    public ResponseEntity<DeviceDto> getDeviceById(@PathVariable Long deviceId) {
        return ResponseEntity.ok(deviceService.getById(deviceId));
    }

    @PostMapping("/api/devices")
    public ResponseEntity<DeviceDto> createDevice(@RequestBody @Valid CreateUpdateDeviceCommand command) {
        return ResponseEntity.ok(deviceService.create(command));
    }

    @PutMapping("/api/devices/{deviceId}")
    public ResponseEntity<DeviceDto> updateDeviceById(@PathVariable Long deviceId, @RequestBody @Valid CreateUpdateDeviceCommand command) {
        return ResponseEntity.ok(deviceService.updateById(deviceId, command));
    }

    @DeleteMapping("/api/devices/{deviceId}")
    public ResponseEntity<Void> deleteDeviceById(@PathVariable Long deviceId) {
        deviceService.deleteById(deviceId);

        return ResponseEntity.ok().build();
    }
}
