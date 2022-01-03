package com.poc.doctor.doctorappointment.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String doctorName;
    private Date slotTime;

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getDoctorName() {
	return doctorName;
    }

    public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
    }

    public Date getSlotTime() {
	return slotTime;
    }

    public void setSlotTime(Date slotTime) {
	this.slotTime = slotTime;
    }

}
