package com.github.kolegran.smarthome.home;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private HomeService homeService;

    @GetMapping("/api/homes")
    public ResponseEntity<List<HomeSimpleDto>> getAllHomes() {
        return ResponseEntity.ok(homeService.getAll());
    }

    @GetMapping("/api/homes/{homeId}")
    public ResponseEntity<HomeDto> getHomeById(@PathVariable Long homeId) {
        return ResponseEntity.ok(homeService.getById(homeId));
    }

    @PostMapping("/api/homes")
    public ResponseEntity<HomeDto> createHome(@RequestBody @Valid CreateUpdateHomeCommand command) {
        return ResponseEntity.ok(homeService.create(command));
    }

    @PutMapping("/api/homes/{homeId}")
    public ResponseEntity<HomeDto> updateHomeById(@PathVariable Long homeId, @RequestBody @Valid CreateUpdateHomeCommand command) {
        return ResponseEntity.ok(homeService.updateById(homeId, command));
    }

    @DeleteMapping("/api/homes/{homeId}")
    public ResponseEntity<Void> deleteHomeById(@PathVariable Long homeId) {
        homeService.deleteById(homeId);
        return ResponseEntity.ok().build();
    }
}
