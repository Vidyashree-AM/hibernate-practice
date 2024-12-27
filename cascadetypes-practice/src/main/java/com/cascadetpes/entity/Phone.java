package com.cascadetpes.entity;

import javax.persistence.*;

@Entity
public class Phone {
	
	@Id
	private long id;
	
	@Column(name="Number")
	private String number;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Person Owner;

	public Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		Owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
