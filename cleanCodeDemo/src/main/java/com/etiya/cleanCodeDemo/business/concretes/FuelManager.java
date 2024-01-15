package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.FuelService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.FuelRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FuelManager implements FuelService {
    private FuelRepository fuelRepository;
    @Override
    public void add(Fuel fuel) {
        fuelRepository.save(fuel);

    }
}
