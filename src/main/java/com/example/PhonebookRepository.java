package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhonebookRepository extends JpaRepository<Person, Long> {
	List<Person> findAll();
}
