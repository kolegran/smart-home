package com.github.kolegran.smarthome.home;

import com.github.kolegran.smarthome.address.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Pageable;

@Service
@RequiredArgsConstructor
public class HomeService {
    private final HomeRepository homeRepository;
    private final AddressRepository addressRepository;

    @Transactional(readOnly = true)
    public Page<HomeDto> getAll(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());
        return homeRepository.findAll(pageable).map(HomeDto::new);
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
