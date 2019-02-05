package com.github.kolegran.smarthome.country.city.home;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HomeService {
    private final HomeRepository homeRepository;

    @Transactional(readOnly = true)
    public List<HomeDto> getAll() {
        return homeRepository.findAll()
                .stream()
                .map(HomeDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public HomeDto create(CreateHomeCommand command) {
        Home home = new Home();
        //home.setOwner(command.getOwner());
        //home.setAddress(command.getAddress());
        return new HomeDto(homeRepository.save(home));
    }
}
