package com.poc.doctor.doctorappointment.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poc.doctor.doctorappointment.entity.User;
import com.poc.doctor.doctorappointment.service.BookingService;
import com.poc.doctor.doctorappointment.service.DoctorService;
import com.poc.doctor.doctorappointment.service.UserService;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookingService bookingService;

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/")
    public String display(Model model) {
	model.addAttribute("login", new Login());
	return "login";
    }

    @RequestMapping(path = "/l1", method = RequestMethod.POST)
    public String login(@ModelAttribute Login login, Model model) {
	User user = userService.getByEmail(login.getEmail());
	model.addAttribute("user", user);
	return "index";
    }

    @RequestMapping("/s1")
    public String signup(Model model) {
	return "signup";
    }

    @RequestMapping("/b1")
    public String b1(Model model, @ModelAttribute String email) {
	User user = userService.getByEmail(email);
	model.addAttribute("user", user);
	model.addAttribute("doctors", doctorService.getAll());
	return "booking";
    }

    @RequestMapping("/signup")
    public String add(@ModelAttribute User user, Model model) {
	user = userService.save(user);
	model.addAttribute("user", user);
	model.addAttribute("bookings", new ArrayList<>());
	return "index";
    }
}
