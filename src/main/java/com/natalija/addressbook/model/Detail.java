package com.natalija.addressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Detail {

	public enum Type {
		NUMBER, ADDRESS, EMAIL, NOTE
	}

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name= "DETAILTYPE")
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@Column(name= "DETAILVALUE")
	private String value;
	
	@ManyToOne
	@JoinColumn(name = "ENTRYID")
	private AddressEntry entry;
	
}
