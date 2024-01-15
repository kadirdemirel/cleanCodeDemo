package com.etiya.cleanCodeDemo.dataAccess.abstracts;

import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    Brand findByName(String name);
}
