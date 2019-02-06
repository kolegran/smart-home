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
    public ResponseEntity<List<RoomSimpleDto>> getAllCities(@PathVariable Long homeId) {
        return ResponseEntity.ok(roomService.getAllByHomeId(homeId));
    }

    @PostMapping("/api/homes/{homeId}/rooms")
    public ResponseEntity<RoomDto> createCity(@PathVariable Long homeId,
                                              @RequestBody @Valid CreateRoomCommand command) {
        return ResponseEntity.ok(roomService.create(command, homeId));
    }
}
//GET /rooms
//GET /rooms/{roomId}
//POST /rooms
//PUT /rooms/{roomId}
//DELETE /rooms/{roomId}
