package com.natalija.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.natalija.addressbook.model.PersonRepository;

@Controller
public class AddressbookMVCController {
	@Autowired
	PersonRepository personRepository;

	@GetMapping("/addressbook-mvc")
	public String showPersonsDetails(Model model) {
		model.addAttribute("persons", personRepository.findAll());
		return "addressbook-mvc";
	}
}
