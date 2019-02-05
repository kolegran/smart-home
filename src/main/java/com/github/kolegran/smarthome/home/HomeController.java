package com.github.kolegran.smarthome.home;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private HomeService homeService;

    @GetMapping("/api/homes")
    public ResponseEntity<List<HomeDto>> getAllHomes() {
        return ResponseEntity.ok(homeService.getAll());
    }

    @PostMapping("/api/homes")
    public ResponseEntity<HomeDto> createHome(CreateHomeCommand command) {
        return ResponseEntity.ok(homeService.create(command));
    }
}
