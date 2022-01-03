package com.poc.doctor.doctorappointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.doctor.doctorappointment.entity.Booking;
import com.poc.doctor.doctorappointment.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getBookins(String email) {
	return bookingRepository.findByEmail(email);
    }

}
