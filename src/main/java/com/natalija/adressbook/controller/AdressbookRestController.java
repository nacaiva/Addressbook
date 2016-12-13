package com.natalija.adressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natalija.adressbook.model.Person;
import com.natalija.adressbook.model.PersonRepository;

@RestController
public class AdressbookRestController {

	@Autowired
	PersonRepository personRepository;

	@RequestMapping("/adressbook")
	List<Person> perosons() {
		return personRepository.findAll();
	}
}
