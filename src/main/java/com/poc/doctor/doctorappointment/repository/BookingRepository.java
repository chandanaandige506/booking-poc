package com.poc.doctor.doctorappointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.doctor.doctorappointment.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByEmail(String email);
}
