package com.github.kolegran.smarthome.device;

import com.github.kolegran.smarthome.home.HomeRepository;
import com.github.kolegran.smarthome.home.room.RoomRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

public class DeviceService {
    private DeviceRepository deviceRepository;
    private RoomRepository roomRepository;
    private HomeRepository homeRepository;

    @Transactional(readOnly = true)
    public List<DeviceSimpleDto> getAll() {
        return deviceRepository.findAll()
                .stream()
                .map(DeviceSimpleDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public DeviceDto getById(Long deviceId) {
        return new DeviceDto(deviceRepository.getOne(deviceId));
    }

    @Transactional
    public DeviceDto create(CreateUpdateDeviceCommand command) {
        Device device = new Device();
        device.setTitle(command.getTitle());
        device.setRoom(roomRepository.getOne(command.getRoomId()));
        device.setHome(homeRepository.getOne(command.getHomeId()));
        return new DeviceDto(deviceRepository.save(device));
    }

    @Transactional
    public DeviceDto updateById(Long deviceId, CreateUpdateDeviceCommand command) {
        Device device = deviceRepository.getOne(deviceId);
        device.setTitle(command.getTitle());
        device.setRoom(roomRepository.getOne(command.getRoomId()));
        device.setHome(homeRepository.getOne(command.getHomeId()));
        return new DeviceDto(deviceRepository.save(device));
    }

    @Transactional
    public void deleteById(Long deviceId) {
        deviceRepository.deleteById(deviceId);
    }
}
