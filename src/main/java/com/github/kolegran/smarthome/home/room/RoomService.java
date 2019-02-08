package com.github.kolegran.smarthome.home.room;

import com.github.kolegran.smarthome.home.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
    private final HomeRepository homeRepository;

    @Transactional(readOnly = true)
    public List<RoomSimpleDto> getAllByHomeId(Long roomId) {
        return roomRepository.findAll()
                .stream()
                .filter(c -> c.getHome().getId().equals(roomId))
                .map(RoomSimpleDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public RoomDto create(CreateUpdateRoomCommand command, Long homeId) {
        Room room = new Room();
        room.setName(command.getName());
        room.setFloor(command.getFloor());
        room.setHome(homeRepository.getOne(homeId));
        return new RoomDto(roomRepository.save(room));
    }

    @Transactional
    public RoomDto updateById(Long roomId, CreateUpdateRoomCommand command, Long homeId) {
        Room updateRoom = roomRepository.getOne(roomId);
        updateRoom.setName(command.getName());
        updateRoom.setFloor(command.getFloor());
        updateRoom.setHome(homeRepository.getOne(homeId));
        return new RoomDto(roomRepository.save(updateRoom));
    }

    @Transactional
    public void deleteById(Long roomId) {
        roomRepository.deleteById(roomId);
    }
}
