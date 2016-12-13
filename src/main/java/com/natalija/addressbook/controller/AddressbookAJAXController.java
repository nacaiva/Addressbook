package com.natalija.addressbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressbookAJAXController {
	@GetMapping("/addressbook-ajax")
	public String showPersonsDetails() {
		return "addressbook-ajax";
	}
}
