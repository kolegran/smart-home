package com.github.kolegran.smarthome.device.data;

import com.github.kolegran.smarthome.device.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DeviceDataService {
    private DeviceDataRepository deviceDataRepository;
    private DeviceRepository deviceRepository;

    @Transactional(readOnly = true)
    public List<DeviceDataSimpleDto> getAll() {
        return deviceDataRepository.findAll()
                .stream()
                .map(DeviceDataSimpleDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public DeviceDataDto getById(Long dataId) {
        return new DeviceDataDto(deviceDataRepository.getOne(dataId));
    }

    @Transactional
    public DeviceDataDto create(CreateDeviceDataCommand command) {
        DeviceData deviceData = new DeviceData();

        deviceData.setDevice(deviceRepository.getOne(command.getDeviceId()));
        deviceData.setCreatedAt(command.getCreatedAt());
        deviceData.setValue(command.getValue());

        return new DeviceDataDto(deviceDataRepository.save(deviceData));
    }

}
