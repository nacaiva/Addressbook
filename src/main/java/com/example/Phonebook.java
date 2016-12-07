package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Phonebook {

	@Autowired
	PhonebookRepository phonebookRepository;

	@RequestMapping("/phonebook")
	List<Person> perosons() {
		return this.phonebookRepository.findAll();
	}
}
