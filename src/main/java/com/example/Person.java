package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
	private List<Phone> numbers;

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
			for (Phone num : numbers) {
				res += "Numbers: " + num.getNumber() + "\n";
			}
		}
		return res;
	}
}
