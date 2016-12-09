package com.natalija.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natalija.phonebook.PersonRepository;
import com.natalija.phonebook.model.Person;

@RestController
public class PhonebookController {

	@Autowired
	PersonRepository personRepository;

	@RequestMapping("/phonebook")
	List<Person> perosons() {
		return personRepository.findAll();
	}
}
