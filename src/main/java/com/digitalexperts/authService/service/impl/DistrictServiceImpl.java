package com.digitalexperts.authService.service.impl;

import com.digitalexperts.authService.bo.District;
import com.digitalexperts.authService.repository.DistrictRepository;
import com.digitalexperts.authService.service.DistrictService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Optional;

/**
 * @author Babacar FAYE (babacar.faye@mns-consulting.com)
 * @since 20/05/2020 01:28
 */

@Service
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }


    @Override
    public Flux<District> findAllBy() {
        return Flux.fromIterable( districtRepository.findAllBy());
    }

    @Override
    public Flux<District> findAllByDepartement_Id(Long id) {
        return Flux.fromIterable( districtRepository.findAllByDepartement_Id(id));
    }

    @Override
    public Flux<District> findAllByDepartement_Region_Id(Long id) {
        return Flux.fromIterable( districtRepository.findAllByDepartement_Region_Id(id));
    }

    @Override
    public Flux<District> findAllByArrondissement_Id(Long id) {
       return Flux.fromIterable(districtRepository.findAllByArrondissement_Id(id));
    }

    @Override
    public Optional<District> findOneById(Long id) {
      return   districtRepository.findById(id);
    }

    @Override
    public District findbyName(String name) {
        return districtRepository.findByLibelleEqualsIgnoreCase(name);
    }
}


