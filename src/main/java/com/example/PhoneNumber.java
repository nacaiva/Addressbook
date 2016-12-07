package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "PHONE")
public class PhoneNumber {

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

	public PhoneNumber() {

	}

	public PhoneNumber(String numbers, Person person) {
		this.number = numbers;
		this.person = person;
	}

	@Override
	public String toString() {
		return "[ " + number + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String numbers) {
		this.number = numbers;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
