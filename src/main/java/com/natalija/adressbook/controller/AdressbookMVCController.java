package com.natalija.adressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.natalija.adressbook.model.PersonRepository;

@Controller
public class AdressbookMVCController {

	@Autowired
	PersonRepository personRepo;

	@GetMapping("/")
	public String showPersonsDetails(Model model) {
		model.addAttribute("persons", personRepo.findAll());
		return "adressbook";
	}

}
