package com.poc.doctor.doctorappointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.doctor.doctorappointment.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findByEmail(String email);

}
