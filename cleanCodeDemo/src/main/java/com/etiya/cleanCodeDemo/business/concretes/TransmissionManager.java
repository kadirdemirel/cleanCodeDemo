package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.TransmissionService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.TransmissionRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransmissionManager implements TransmissionService {
    private TransmissionRepository transmissionRepository;

    @Override
    public void add(Transmission transmission) {
        transmissionRepository.save(transmission);
    }
}
