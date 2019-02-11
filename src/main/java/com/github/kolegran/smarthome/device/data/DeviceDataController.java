package com.github.kolegran.smarthome.device.data;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DeviceDataController {
    private DeviceDataService deviceDataService;

    @GetMapping("/api/data")
    public ResponseEntity<List<DeviceDataSimpleDto>> getAllData() {
        return ResponseEntity.ok(deviceDataService.getAll());
    }

    @GetMapping("/api/data/{dataId}")
    public ResponseEntity<DeviceDataDto> getDataById(@PathVariable Long dataId) {
        return ResponseEntity.ok(deviceDataService.getById(dataId));
    }

    @PostMapping("/api/data")
    public ResponseEntity<DeviceDataDto> createData(@RequestBody @Valid CreateDeviceDataCommand command) {
        return ResponseEntity.ok(deviceDataService.create(command));
    }
}
