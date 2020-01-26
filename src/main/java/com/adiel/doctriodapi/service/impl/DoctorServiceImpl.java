package com.adiel.doctriodapi.service.impl;

import com.adiel.doctriodapi.model.Doctor;
import com.adiel.doctriodapi.repository.DoctorRepository;
import com.adiel.doctriodapi.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
