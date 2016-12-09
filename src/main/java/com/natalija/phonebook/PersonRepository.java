package com.natalija.phonebook;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natalija.phonebook.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findAll();
}
