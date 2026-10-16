package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.MedicalCamp;

public interface MedicalCampService {

    MedicalCamp add(MedicalCamp medicalCamp);

    List<MedicalCamp> getAll();

    boolean delete(Long id);
}
