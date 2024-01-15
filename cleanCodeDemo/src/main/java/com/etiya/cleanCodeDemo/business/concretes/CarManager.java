package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.CarService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.CarRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private CarRepository carRepository;

    @Override
    public void add(Car car) {
        carRepository.save(car);
    }
}
