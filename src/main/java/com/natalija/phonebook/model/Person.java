package com.natalija.phonebook.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	@OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
	private List<Phone> numbers;

}
