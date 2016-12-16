package com.natalija.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.natalija.addressbook.model.EntryRepository;

@Controller
public class AddressbookMVCController {
	@Autowired
	EntryRepository entryRepository;

	@GetMapping("/addressbook-mvc")
	public String showPersonsDetails(Model model) {
		model.addAttribute("entries", entryRepository.findAll());
		return "addressbook-mvc";
	}
}
