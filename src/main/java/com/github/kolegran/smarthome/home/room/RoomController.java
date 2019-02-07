package com.github.kolegran.smarthome.home.room;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping("/api/homes/{homeId}/rooms")
    public ResponseEntity<List<RoomSimpleDto>> getAllRooms(@PathVariable Long homeId) {
        return ResponseEntity.ok(roomService.getAllByHomeId(homeId));
    }

    @PostMapping("/api/homes/{homeId}/rooms")
    public ResponseEntity<RoomDto> createRoom(@PathVariable Long homeId,
                                              @RequestBody @Valid CreateRoomCommand command) {
        return ResponseEntity.ok(roomService.create(command, homeId));
    }

    @PutMapping("/api/homes/{homeId}/rooms/{roomId}")
    public ResponseEntity<RoomDto> updateRoomById(@PathVariable Long roomId) {
        return ResponseEntity.ok(roomService.updateById(roomId));
    }

    @DeleteMapping("/api/homes/{homeId}/rooms/{roomId}")
    public ResponseEntity<Void> deleteRoomById(@PathVariable Long roomId) {
        roomService.deleteById(roomId);
        return ResponseEntity.ok().build();
    }
}

