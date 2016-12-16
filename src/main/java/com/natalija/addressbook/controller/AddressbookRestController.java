package com.natalija.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natalija.addressbook.model.AddressEntry;
import com.natalija.addressbook.model.EntryRepository;

@RestController
public class AddressbookRestController {

	@Autowired
	EntryRepository personRepository;

	@GetMapping("/addressbook")
	List<AddressEntry> perosons() {
		return personRepository.findAll();
	}
}
