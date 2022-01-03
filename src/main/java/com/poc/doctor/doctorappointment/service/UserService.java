package com.poc.doctor.doctorappointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.doctor.doctorappointment.entity.User;
import com.poc.doctor.doctorappointment.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getByEmail(String email) {
	return userRepository.findByEmail(email);
    }

    public User save(User user) {
	return userRepository.save(user);
    }
}
