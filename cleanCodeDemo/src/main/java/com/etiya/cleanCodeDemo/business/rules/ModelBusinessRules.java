package com.etiya.cleanCodeDemo.business.rules;

import com.etiya.cleanCodeDemo.business.messages.ModelBusinessMessages;
import com.etiya.cleanCodeDemo.core.utilites.exceptions.types.BusinessException;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelBusinessRules {
    private ModelRepository modelRepository;
    public void maxBrand(int brandId) {
        if (modelRepository.getByBrandId(brandId).size() > 5) {
            throw new BusinessException(ModelBusinessMessages.MAX_MODEL);
        }
    }
}
