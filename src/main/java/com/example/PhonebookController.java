package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhonebookController {

	@Autowired
	PersonRepository personRepository;

	@RequestMapping("/phonebook")
	List<Person> perosons() {
		return this.personRepository.findAll();
	}
}
