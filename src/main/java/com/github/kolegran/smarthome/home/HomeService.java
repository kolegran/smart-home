package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HomeService {
    private final HomeRepository homeRepository;
    private final AddressRepository addressRepository;

    @Transactional(readOnly = true)
    public List<HomeSimpleDto> getAll() {
        return homeRepository.findAll()
                .stream()
                .map(HomeSimpleDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public HomeDto getById(Long homeId) {
        return new HomeDto(homeRepository.getOne(homeId));
    }

    @Transactional
    public HomeDto create(CreateUpdateHomeCommand command) {
        Home home = new Home();
        home.setAddress(addressRepository.getOne(command.getAddressId()));
        return new HomeDto(homeRepository.save(home));
    }

    @Transactional
    public HomeDto updateById(Long homeId, CreateUpdateHomeCommand command) {
        Home updateHome = homeRepository.getOne(homeId);
        updateHome.setAddress(addressRepository.getOne(command.getAddressId()));
        return new HomeDto(homeRepository.save(updateHome));
    }

    @Transactional
    public void deleteById(Long homeId) {
        homeRepository.deleteById(homeId);
    }
}
