package com.natalija.adressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.natalija.adressbook.model.Person;
import com.natalija.adressbook.model.PersonRepository;

@SpringBootApplication
public class AdressbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdressbookApplication.class, args);
	}
}

class AdressBookCommandLineRunner implements CommandLineRunner {

	@Autowired
	PersonRepository personRepo;

	@Override
	public void run(String... arg0) throws Exception {

		for (Person p : personRepo.findAll()) {
			System.out.println(p.toString());
		}

	}

}