package com.etiya.cleanCodeDemo.dataAccess.abstracts;

import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import com.etiya.cleanCodeDemo.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
