package com.github.kolegran.smarthome.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/api/users")
    public ResponseEntity<List<UserSimpleDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/api/users/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getById(userId));
    }

    @PostMapping("/api/users")
    public ResponseEntity<UserDto> createUser(@RequestBody @Valid CreateUserCommand command) {
        return ResponseEntity.ok(userService.create(command));
    }

    @PutMapping("/api/users/{userId}")
    public ResponseEntity<UserDto> updateUserById(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.updateById(userId));
    }

    @DeleteMapping("/api/users/{userId}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long userId) {
        userService.deleteById(userId);
        return ResponseEntity.ok().build();
    }
}
