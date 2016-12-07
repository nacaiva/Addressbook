package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "PERSON")
public class Person {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	@Column(name = "FIRSTNAME")
	private String firstname;
	@Column(name = "LASTNAME")
	private String lastname;

	@OneToMany(mappedBy = "person")
	private List<PhoneNumber> numbers;

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		numbers = new ArrayList<>();
	}

	public Person() {

	}

	@Override
	public String toString() {
		String res = "Person:  " + id + " - " + firstname + " " + lastname + "\n ";
		if (numbers != null) {
			for (PhoneNumber num : numbers) {
				res += "Numbers: " + num.getNumber() + "\n";
			}
		}
		return res;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<PhoneNumber> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<PhoneNumber> numbers) {
		this.numbers = numbers;
	}

	
	
}
