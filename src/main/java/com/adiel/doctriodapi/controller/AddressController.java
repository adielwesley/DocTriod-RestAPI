package com.adiel.doctriodapi.controller;

import com.adiel.doctriodapi.model.Doctor;
import com.adiel.doctriodapi.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class AddressController {

    @Autowired
    DoctorService doctorService;

    @GetMapping
    ResponseEntity<List<Doctor>> getAll() {
        return ResponseEntity.ok().body(doctorService.getAll());
    }
}
