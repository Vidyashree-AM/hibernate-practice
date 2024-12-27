package com.embedded.entity;

import javax.persistence.*;

@Entity
@Table (name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Embedded
	private Name name;
	
	private String email;
	
	@Embedded
	@AttributeOverrides(value = {
	   @AttributeOverride(name="addressLine1",column = @Column(name="house_nm")),
	   @AttributeOverride(name="addressLine2",column = @Column(name="Street"))
	})
	private Address address;

	public User() {
		super();
	}

	public User(Name name, String email, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
