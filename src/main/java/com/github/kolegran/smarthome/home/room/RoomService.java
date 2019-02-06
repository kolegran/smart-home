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

    @Transactional
    public RoomDto create(CreateRoomCommand command, Long roomId) {
        Room room = new Room();
        room.setName(command.getName());
        room.setFloor(command.getFloor());
        room.setHome(homeRepository.getOne(roomId));
        return new RoomDto(roomRepository.save(room));
    }

    @Transactional(readOnly = true)
    public List<RoomSimpleDto> getAllByHomeId(long roomId) {
        return roomRepository.findAll()
                .stream()
                .filter(c -> c.getHome().getId().equals(roomId))
                .map(RoomSimpleDto::new)
                .collect(Collectors.toList());
    }
}
