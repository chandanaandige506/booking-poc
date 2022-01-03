package com.poc.doctor.doctorappointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.doctor.doctorappointment.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
