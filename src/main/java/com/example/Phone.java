package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "PHONE")
public class Phone {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	@Column(name = "NUMBER")
	private String number;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "PERSONID")
	private Person person;

	public Phone() {

	}

	public Phone(String numbers, Person person) {
		this.number = numbers;
		this.person = person;
	}

	@Override
	public String toString() {
		return "[ " + number + "]";
	}



}
