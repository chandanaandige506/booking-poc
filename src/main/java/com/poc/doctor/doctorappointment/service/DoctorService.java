package com.poc.doctor.doctorappointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.doctor.doctorappointment.entity.Doctor;
import com.poc.doctor.doctorappointment.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor getByEmail(String email) {
	return doctorRepository.findByEmail(email);
    }

    public Doctor save(Doctor doctor) {
	return doctorRepository.save(doctor);
    }

    public List<Doctor> getAll() {
	return doctorRepository.findAll();
    }
}
