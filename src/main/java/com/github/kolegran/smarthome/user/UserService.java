package com.github.kolegran.smarthome.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserSimpleDto> getAll() {
        return userRepository.findAll()
                .stream()
                .map(UserSimpleDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UserDto getById(Long userId) {
        return new UserDto(userRepository.getOne(userId));
    }

    @Transactional
    public UserDto create(CreateUserCommand command) {
        User user = new User();
        return new UserDto(userRepository.save(user));
    }

    @Transactional
    public UserDto updateById(Long userId) {
        User updateUser = userRepository.getOne(userId);
        // updating...
        return new UserDto(userRepository.save(updateUser));
    }

    @Transactional
    public void deleteById(Long userId) {
        userRepository.deleteById(userId);
    }
}
