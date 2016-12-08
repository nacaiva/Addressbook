package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhonebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}
}

class PhoneBookCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {

		for (Person p : this.personRepo.findAll()) {
			System.out.println(p.toString());
		}

	}

	@Autowired
	PersonRepository personRepo;

}