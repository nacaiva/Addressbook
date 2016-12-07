package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, String> {
	List<PhoneNumber> findByPersonId(Person person);
}
