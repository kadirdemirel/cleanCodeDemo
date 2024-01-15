package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.ModelService;
import com.etiya.cleanCodeDemo.business.rules.ModelBusinessRules;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.ModelRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelBusinessRules modelBusinessRules;
    @Override
    public void add(Model model) {
        modelBusinessRules.maxBrand(model.getBrand().getId());
        modelRepository.save(model);
    }

}
