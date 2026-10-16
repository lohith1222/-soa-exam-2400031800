package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.MedicalCamp;
import com.klef.soa.exam.repository.MedicalCampRepository;

@Service
public class MedicalCampServiceImpl implements MedicalCampService {

    private final MedicalCampRepository repository;

    public MedicalCampServiceImpl(MedicalCampRepository repository) {
        this.repository = repository;
    }

    @Override
    public MedicalCamp add(MedicalCamp medicalCamp) {
        medicalCamp.setId(null);
        return repository.save(medicalCamp);
    }

    @Override
    public List<MedicalCamp> getAll() {
        return repository.findAll();
    }

    @Override
    public boolean delete(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
