package com.natalija.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natalija.addressbook.model.Person;
import com.natalija.addressbook.model.PersonRepository;

@RestController
public class AddressbookRestController {

	@Autowired
	PersonRepository personRepository;

	@GetMapping("/addressbook")
	List<Person> perosons() {
		return personRepository.findAll();
	}
}
