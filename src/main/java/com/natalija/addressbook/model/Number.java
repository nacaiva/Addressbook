package com.natalija.addressbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Number {

	@Id
	@GeneratedValue
	private Long id;

	private String number;

	@ManyToOne
	@JoinColumn(name = "PERSONID")
	private Person person;

	@JsonIgnore
	public Person getPerson() {
		return person;
	}

	@Override
	public String toString() {
		return "" + number + "\n";
	}

}
