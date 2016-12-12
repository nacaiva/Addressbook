package com.natalija.phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.natalija.phonebook.model.Person;
import com.natalija.phonebook.model.PersonRepository;

@SpringBootApplication
public class PhonebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}
}

class PhoneBookCommandLineRunner implements CommandLineRunner {

	@Autowired
	PersonRepository personRepo;
	
	@Override
	public void run(String... arg0) throws Exception {

		for (Person p : personRepo.findAll()) {
			System.out.println(p.toString());
		}

	}

	

}