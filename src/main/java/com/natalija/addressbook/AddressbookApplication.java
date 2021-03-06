package com.natalija.addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.natalija.addressbook.model.AddressEntry;
import com.natalija.addressbook.model.EntryRepository;

@SpringBootApplication
public class AddressbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookApplication.class, args);
	}
}

class AdressBookCommandLineRunner implements CommandLineRunner {

	@Autowired
	EntryRepository personRepo;

	@Override
	public void run(String... arg0) throws Exception {

		for (AddressEntry p : personRepo.findAll()) {
			System.out.println(p.toString());
		}

	}

}