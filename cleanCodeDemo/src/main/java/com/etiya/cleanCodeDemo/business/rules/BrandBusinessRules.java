package com.etiya.cleanCodeDemo.business.rules;

import com.etiya.cleanCodeDemo.business.messages.BrandBusinessMessages;
import com.etiya.cleanCodeDemo.core.utilites.exceptions.types.BusinessException;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.BrandRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private BrandRepository brandRepository;


    public void checkIfBrandExistsByName(String name) {
        Brand currentBrand = brandRepository.findByName(name);
        if (currentBrand != null) {
            throw new BusinessException(BrandBusinessMessages.BRAND_EXISTS);
        }
    }
}
