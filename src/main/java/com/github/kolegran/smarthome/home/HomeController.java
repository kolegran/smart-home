package com.github.kolegran.smarthome.home;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final HomeService homeService;

    @GetMapping("/api/homes")
    public ResponseEntity<Page<HomeDto>> getAllHomes(Pageable pageable) {
        return ResponseEntity.ok(homeService.getAll(pageable));
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
