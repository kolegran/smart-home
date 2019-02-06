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
        home.setAddress(addressRepository.getOne(command.getAddressId()));
        return new HomeDto(homeRepository.save(home));
    }
}
