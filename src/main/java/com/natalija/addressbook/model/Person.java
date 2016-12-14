package com.natalija.addressbook.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	private String firstname;
	private String lastname;

	@OneToMany(mappedBy = "person")
	private List<Number> numbers;

	@OneToMany(mappedBy = "person")
	private List<Address> addresses;

	@OneToMany(mappedBy = "person")
	private List<Email> emails;

	@OneToMany(mappedBy = "person")
	private List<Note> notes;

}
