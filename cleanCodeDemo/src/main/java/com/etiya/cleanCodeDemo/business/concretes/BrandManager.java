package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.BrandService;
import com.etiya.cleanCodeDemo.business.rules.BrandBusinessRules;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.BrandRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private BrandBusinessRules brandBusinessRules;
    @Override
    public void add(Brand brand) {
        brandBusinessRules.checkIfBrandExistsByName(brand.getName());
        brandRepository.save(brand);
    }

}
